package se.dsve.adventureawaits;

import java.util.HashMap;
import java.util.Scanner;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class Player {
    public static String name;
    private int hp;
    private int level;
    private int levelXp;
    private int xp;
    public int totalHp;
    public int currentHp;
    public Weapon weapon;
    public int goldAmount;
    private HashMap<String, Integer> monsterEncounters = new HashMap<>();



    public Player(String name, int startHp, Weapon weapon) {
        Scanner scanner = new Scanner(System.in);// Skriv din kod här
        this.hp = 100;
        this.name = scanner.nextLine();
        this.level = 1;
        this.levelXp = 100;
        this.xp = 0;
        this.totalHp = 100;
        this.currentHp = 100;
        this.weapon = new Weapon("sword", 10);
        this.goldAmount = 0;
    }

    public void attack(Monster monster) {
        // Skriv din kod här
        if (monster.hp > 0) {
            monster.hp -= weapon.getDamage();
        }
        if (monster.hp <= 0) {
            System.out.println("Du dödade " + monster.getName() + ".");
            System.out.println("Du fick " + monster.getGoldReward() + " guld.");
            System.out.println("Du fick " + monster.getXpReward() + " xp.");
            goldAmount += monster.getGoldReward();
            xp += monster.getXpReward();
            monsterEncounters.put(monster.getName(), monsterEncounters.getOrDefault(monster.getName(), 0) + 1);
        }
    }

    public void levelUp(GameEngine gameEngine) {
        // Skriv din kod här
        // Tips: Använd gameEngine.levelXp för att kolla om spelaren ska levla upp
        if (xp >= levelXp) {
            level++;
            xp -= levelXp;
            levelXp = (int) (levelXp * 1.5);
            totalHp = (int)(totalHp*1.1);
            currentHp = totalHp;
            System.out.println("Du har levlat upp.");
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String playerName) {
        Player player = new Player(playerName, 100, weapon);
    }
    public void restoreHp() {
        // Skriv din kod här
        // Tips: Använd gameEngine.startHp för att återställa spelarens hp
        currentHp = totalHp;
        System.out.println("Du har återställt ditt hp.");
    }

}
