package se.dsve.adventureawaits;


/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */
import java.util.Random;


public class GameEngine {

    private static Random random = new Random();
    private static boolean inAdventure = false;
    public static int startHp = 100;  // Default values
    private static int levelXp = 100;  // Default values
    public static int weaponDamage = 10;  // Default values
    private static boolean gameStarted = false;
    private static int currentPlayerHp;

    private static Player player;

    public static void battle(Player player, Monster monster) {

        int playerDamage = player.calculateDamage();
        int monsterDamage = monster.calculateDamage();
        int playerHp = player.getHp();
        int monsterHp = monster.getHp();

        if (playerHp <= 0) {
            System.out.println("Du har dött.");
        } else if (monsterHp <= 0) {
            System.out.println("Du har redan besegrat " + monster.getName() + ".");
        } else {
            System.out.println("Du möter en " + monster.getName() + ".");
            System.out.println("Du har " + playerHp + " hp.");
            System.out.println("Fienden har " + monsterHp + " hp.");
        }
    }

    // Getter for startHp
    public void startAdvanture() {
        if(!gameStarted) {
            System.out.println("Du måste starta spelet först.");
            return;
        }
        if(inAdventure){
            System.out.println("Du är redan i äventyret.");
            return;
        }
        inAdventure = true;
        System.out.println("Du har startat ett äventyr.");

        int encounterChance = random.nextInt(100)+1;//ger ett tal mellan 1-100

        if (encounterChance <= 90) {
            // Encounter a monster
            Monster monster = new Monster("Goblin", 30, 5, 10, 20);
            battle(player, monster);
        } else if (encounterChance > 90 && encounterChance <= 95) {
            //Encounter ett boss
            Boss boss;
            do {
                try {
                    boss = new Boss("Dragon", 100, 20, 50, 100);
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Boss skapades inte. Försöker igen...");
                }
            } while (true);
            battle(player, boss);
        } else {
            // No encounter, award some small rewards
            awardAdventureRewards(player);
        }
        inAdventure = false;
    }

    private void awardAdventureRewards(Player player) {
        System.out.println("Du hittade en skatt!");
        int goldReward = random.nextInt(10)+1;
        int xpReward = random.nextInt(10)+1;
        player.setGoldAmount(player.getGoldAmount() + goldReward);
        player.setXp(player.getXp() + xpReward);
        System.out.println("Du fick " + goldReward + " guld.");
        System.out.println("Du fick " + xpReward + " xp.");
    }

    public static int getStartHp() {
        return startHp;
    }

    public static int getLevelXp() {
        return levelXp;
    }

    public static void setLevelXp(int levelXp) {
        GameEngine.levelXp = levelXp;
    }

    public static int getWeaponDamage() {
        return weaponDamage;
    }

    public static void setWeaponDamage(int weaponDamage) {
        GameEngine.weaponDamage = weaponDamage;
    }


    public GameEngine() {
            player = new Player(Menu.getPlayerName(), 100, new Weapon("Sword", 10));
    }

    public static void setDifficulty(int startHp, int levelXp, int weaponDamage) {
        if (!gameStarted) {
            GameEngine.startHp = startHp;
            GameEngine.levelXp = levelXp;
            GameEngine.weaponDamage = weaponDamage;
        } else {
            System.out.println("Du kan inte byta difficulty när spelet har startat.");
        }
    }

    public static void startGame() {
        currentPlayerHp = startHp;
        gameStarted = true;
        System.out.println("Spelet har startat.");
    }

    public static void endGame() {
        gameStarted = false;
        System.out.println("Spelet har avslutats.");
    }

    public static void gameLoop() {
        if (gameStarted) {
            if (currentPlayerHp > 0) {
                System.out.println("Du har " + currentPlayerHp + " hp kvar.");
            } else {
                System.out.println("Du har dött.");
                endGame();
            }
        } else {
            System.out.println("Du måste starta spelet först.");
        }
    }

    public static void restoreHp() {
        if (gameStarted) {
            currentPlayerHp = startHp;
            System.out.println("Du har nu full hp.");
        } else {
            System.out.println("Du måste starta spelet först.");
        }
    }

    public static void upgradeWeapon() {
        if (gameStarted) {
            weaponDamage += 10;
            System.out.println("Ditt vapen har uppgraderats.");
        } else {
            System.out.println("Du måste starta spelet först.");
        }
    }

    public static boolean isGameStarted() {
        return gameStarted;
    }

    public static Player getPlayer() {
       return player;
    }
    public void setPlayerName(String playerName) {
        player.setName(playerName);

    }



    public void displayPlayerInfo() {
        if (player != null) {
            System.out.println("Spelarens namn: " + player.getName());
            System.out.println("Spelarens hp: " + player.getHp());
            System.out.println("Spelarens level: " + player.getLevel());
            System.out.println("Spelarens xp: " + player.getXp());
            System.out.println("Spelarens totalHp: " + player.getTotalHp());
            System.out.println("Spelarens currentHp: " + player.getCurrentHp());
            System.out.println("Spelarens weapon: " + player.getWeapon());
            System.out.println("Spelarens goldAmount: " + player.getGoldAmount());
            System.out.println("Spelarens monsterEncounters: " + player.getMonsterEncounters());
        } else {
            System.out.println("Du måste starta spelet först.");
        }
    }
}