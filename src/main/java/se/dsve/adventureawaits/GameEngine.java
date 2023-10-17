package se.dsve.adventureawaits;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class GameEngine {
    public int startHp;
    public int levelXp;
    public int weaponDamage;
    private boolean gameStarted;

    // Getter for startHp
    public int getStartHp() {
        if (startHp == 0) {
            return 100;
        } else {
            return startHp;
        }

        // Skriv din kod här
    }

    public void setDifficulty(int startHp, int levelXp, int weaponDamage) {
        // Skriv din kod här
        // Om spelet inte har startat än, så kan du ändra svårighetsgraden
        if (!isGameStarted()) {
            this.startHp = startHp;
            this.levelXp = levelXp;
            this.weaponDamage = weaponDamage;
        }
        else {
            System.out.println("Du kan inte byta difficulty när spelet har startat.");
        }

    }

    public void startGame() {
        // Skriv din kod här
        // Start the game
        gameStarted = true;
        currentPlayerHp = getStartHp();
        System.out.println("Spelet har startat.");
    }

    public void endGame() {
        // End the game
        gameStarted = false;
        System.out.println("Spelet har avslutats.");
    }

    public void gameLoop() {
        // Main game loop
        if (isGameStarted()) {
            if (isPlayerAlive()) {
                // Skriv din kod här
                System.out.println("Du har " + currentPlayerHp + " hp kvar.");
            } else {
                // Skriv din kod här
System.out.println("Du har dött.");
endGame();
            } } else {
                System.out.println("Du måste starta spelet först.");






            }
            // Skriv din kod här
        }


    public boolean isGameStarted() {
        // Skriv din kod här
        return gameStarted;
    }

    }
