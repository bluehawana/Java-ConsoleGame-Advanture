package se.dsve.adventureawaits;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    public static void showMenu(String menu, Player player) {
        // Skiv din kod här
        // Om du är i main menyn visa alternativ som är relevant för den
        // Om du är i shop menyn visa alternativ som är relevant för den
        System.out.println("=======================================");
        if (menu.equals("main")) {
            System.out.println("1. Attack");
            System.out.println("2. Shop");
            System.out.println("3. Exit");
        }
        else if (menu.equals("shop")) {
            System.out.println("1. Restore HP");
            System.out.println("2. Upgrade Weapon");
            System.out.println("3. Exit");
        }
        else {
            System.out.println("Du är inte i en meny.");
        }

    }

    public static int getInput() {
        // Skiv din kod här
        // Läs in input från användaren, stäng sedan av scanner
        System.out.print("Vänligen välj ett alternativ: ");
        return scanner.nextInt();

    }

    public static void navigate(String menu, int choice, Player player) {
        // Skiv din kod här
        // Om du är i main menyn navigera till rätt meny
        // Om du är i shop menyn navigera till rätt meny
        if (menu.equals("main")) {
            if (choice == 1) {
                System.out.println("Du valde attack.");
            }
            else if (choice == 2) {
                System.out.println("Du valde shop.");
            }
            else if (choice == 3) {
                System.out.println("Du valde exit.");
            }
            else {
                System.out.println("Du valde inget alternativ.");
            }
        }
        else if (menu.equals("shop")) {
            if (choice == 1) {
                System.out.println("Du valde restore hp.");
            }
            else if (choice == 2) {
                System.out.println("Du valde upgrade weapon.");
            }
            else if (choice == 3) {
                System.out.println("Du valde exit.");
            }
            else {
                System.out.println("Du valde inget alternativ.");
            }
        }
        else {
            System.out.println("Du är inte i en meny.");
        }
    }

    public static String getPlayerName() {
        // Skiv din kod här
        // Läs in input från användaren, stäng sedan av scanner
        System.out.print("Vänligen skriv in ditt namn: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
    public void start(GameEngine gameEngine) {
        // Skiv din kod här
        System.out.println("=======================================");
        System.out.println("Välkommen till Adventure Awaits!");
        System.out.println("=======================================");
        if (gameEngine.isGameStarted()) {
            System.out.println("Du måste avsluta spelet först.");
        }
        else {
            System.out.println("1. Starta spelet");
            System.out.println("2. Avsluta spelet");
            int input = getInput();
            if (input == 1) {
                String playerName = getPlayerName();
                gameEngine.setPlayerName(playerName);
                gameEngine.startGame();
            }
            else if (input == 2) {
                gameEngine.endGame();
            }
            else {
                System.out.println("Du valde inget alternativ.");
            }
        }
    }
}