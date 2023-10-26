package se.dsve.adventureawaits;
/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

import java.util.Scanner;

import static se.dsve.adventureawaits.GameEngine.*;


public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private boolean inGame = false;
    private static String playerName;

    public static void showMenu(String currentMenu, Player player) {
    }

    public static String getPlayerName() {
        return playerName;
    }

    public void start(GameEngine gameEngine) {
        // Skiv din kod här
        System.out.println("Välkommen till Äventyret!");
        System.out.println("Du är en modig och äventyrlig person som har bestämt dig för att utforska en mystisk värld fylld med monster och skatter. ");
        System.out.println("Du har hört att det finns en skatt gömd i en grotta i närheten");
        System.out.println("Du har också hört att det finns en mystisk portal som kan ta dig till en annan värld.");
        System.out.println("Du har bestämt dig för att utforska båda.");

        //Fråga efter spelarens namn
        System.out.println("Säg mig, vad är ditt namn? ");
        playerName = scanner.nextLine();


        System.out.println();
        System.out.println("Välkommen, " + playerName + "!");
        System.out.println();

        gameEngine.setPlayerName(playerName);

            while (true) {
                if (inGame) {
                    System.out.println("[1] - Gå på äventyr 🐲🛡️");
                    System.out.println("[2] - Visa information om spelaren");
                    System.out.println("[8] - Besök butiken");
                    System.out.println("[9] - Avsluta spelet");
                    System.out.println("[0] - Ändra svårighetsgrad");
                } else {
                    System.out.println("1. Starta äventyr");
                    System.out.println("2. Visa information om spelaren");
                    System.out.println("3. Avsluta");
                }

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        if (inGame) {
                            gameEngine.startAdvanture();
                        } else {
                            inGame = true;
                            gameEngine.startGame();
                        }
                        break;
                    case 2:

                        gameEngine.displayPlayerInfo();
                        break;
                    case 3:
                        if (inGame) {
                            inGame = false;
                            gameEngine.endGame();
                        } else {
                            return;
                        }
                        break;
                    case 8:
                        System.out.println("Du valde att besöka butiken.");
                        System.out.println("[1] - Återställ hp");
                        System.out.println("[2] - Uppgradera vapen");
                        System.out.println("[3] - Avsluta");
                        int input2 = getInput();
                        switch (input2) {
                            case 1:
                                System.out.println("Du valde att återställa hp.");
                                gameEngine.restoreHp();
                                break;
                            case 2:
                                System.out.println("Du valde att uppgradera vapen.");
                                gameEngine.upgradeWeapon();
                                break;
                            case 3:
                                System.out.println("Du valde att avsluta.");
                                break;
                            default:
                                System.out.println("Du valde inget alternativ.");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Du valde att avsluta spelet.");
                        gameEngine.endGame();
                        break;
                    case 0:
                        System.out.println("Du valde att ändra svårighetsgrad.");
                        System.out.println("[1] - Lätt");
                        System.out.println("[2] - Medel");
                        System.out.println("[3] - Svår");
                        int input3 = getInput();
                        switch (input3) {
                            case 1:
                                System.out.println("Du valde att ändra svårighetsgrad till lätt.");
                                gameEngine.setDifficulty(100, 50, 10);
                                break;
                            case 2:
                                System.out.println("Du valde att ändra svårighetsgrad till medel.");
                                gameEngine.setDifficulty(100, 50, 10);
                                break;
                            case 3:
                                System.out.println("Du valde att ändra svårighetsgrad till svår.");
                                gameEngine.setDifficulty(100, 50, 10);
                                break;
                            default:
                                System.out.println("Du valde inget alternativ.");
                                break;
                        }
                        break;
                }
            }
        }


    public static void displayPlayerInfo(GameEngine gameEngine)  {
        Player player = gameEngine.getPlayer();
        if (player != null) {
            System.out.println("Du valde att visa information om spelaren.");
            System.out.println("Spelarens namn: " + player.getName());
            System.out.println("Spelarens hp: " + player.getCurrentHp());
            System.out.println("Spelarens level: " + player.getLevel());
            System.out.println("Spelarens xp: " + player.getXp());
            System.out.println("Spelarens totalHp: " + player.getTotalHp());
            System.out.println("Spelarens currentHp: " + player.getCurrentHp());
            System.out.println("Spelarens weapon: " + player.getWeapon().getName());
            System.out.println("Spelarens goldAmount: " + player.getGoldAmount());
            System.out.println("Spelarens monsterEncounters: " + player.getMonsterEncounters());
            System.out.println();
            System.out.println("1. Gå tillbaka till huvudmenyn");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                boolean inAdventure = false; // Go back to the main menu
            } else {
                System.out.println("Ogiltigt val, försök igen.");
            }
        } else {
            System.out.println("Du måste starta spelet först.");
        }
    }

    public static void showMenu(GameEngine gameEngine) {
        // Your code here
        if (gameEngine.isGameStarted()) {
            System.out.println("Du måste avsluta spelet först.");
        } else {
            System.out.println("[1] - Gå på äventyr 🐲🛡️");
            System.out.println("[2] - Visa information om spelaren");
            System.out.println("[8] - Besök butiken");
            System.out.println("[9] - Avsluta spelet");
            System.out.println("[0] - Ändra svårighetsgrad");
        }
    }


    public static int getInput() {
        // Skiv din kod här
        // Läs in input från användaren, stäng sedan av scanner
        System.out.print("Vänligen välj ett alternativ: ");
        return scanner.nextInt();

    }

}