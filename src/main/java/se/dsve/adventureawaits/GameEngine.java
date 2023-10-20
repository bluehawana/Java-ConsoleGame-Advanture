package se.dsve.adventureawaits;


/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */



public class GameEngine {
    public static int startHp = 100;  // Default values
    private static int levelXp = 100;  // Default values
    public static int weaponDamage = 10;  // Default values
    private static boolean gameStarted = false;
    private static int currentPlayerHp;

    // Getter for startHp
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

    public static boolean isGameStarted() {
        return gameStarted;
    }

    public void setPlayerName(String playerName) {
        Player.name = playerName;
    }
}