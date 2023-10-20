package se.dsve;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

import se.dsve.adventureawaits.GameEngine;
import se.dsve.adventureawaits.Menu;
import se.dsve.adventureawaits.Monster;
import se.dsve.adventureawaits.Weapon;
import se.dsve.adventureawaits.Player;
import se.dsve.adventureawaits.Boss;
import se.dsve.adventureawaits.Shop;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("Välkommen till adventureawaits!");
        System.out.println("=======================================");
        GameEngine gameEngine = new GameEngine();

        Menu menu = new Menu();
        menu.start(gameEngine);

        int initiaInput = Menu.getInput();
        if(initiaInput == 1) {
            gameEngine.startGame();
        } else if (initiaInput == 2) {
            gameEngine.endGame();
        } else {
            System.out.println("Felaktig inmatning");
        }

        gameEngine.setDifficulty(100, 50, 10);

        // Initialize spelar med ett vapen
        Weapon playerWeapon = new Weapon("Sword", gameEngine.weaponDamage);
        Player player = new Player(Player.name, gameEngine.startHp, playerWeapon);

        // initialize Monster och Boss
        Monster monster = new Monster("Goblin", 30, 5, 10, 20);
        Boss boss;
        do {
            try {
                boss = new Boss("Dragon", 100, 20, 50, 100);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Boss skapades inte. Försöker igen...");
            }
        } while (true);

        //initialize Shop och Menu
        Shop shop = new Shop();


        // Starta spelet


        String currentMenu = "main";
        while (gameEngine.isGameStarted()) {
            Menu.showMenu(currentMenu, player);
            int userinput = Menu.getInput();

            switch (currentMenu) {
                case "main":
                    if (userinput == 1) {
                        player.attack(monster);
                    } else if (userinput == 2) {
                        currentMenu = "shop";
                    } else if (userinput == 3) {
                        gameEngine.endGame();
                    } else {
                        System.out.println("Felaktig inmatning");
                    }
                    break;
                case "shop":
                    if (userinput == 1) {
                        shop.restoreHp(player);
                    } else if (userinput == 2) {
                        shop.upgradeWeapon(player);
                    } else if (userinput == 3) {
                        currentMenu = "main";
                    } else {
                        System.out.println("Felaktig inmatning");
                    }
                    break;
                default:
                    System.out.println("Felaktig inmatning");
                    break;
            }
        }
    }
}

/*
 * public class Main {
 * public static void main(String[] args) {
 * // Initialize Game Engine and set difficulty
 * GameEngine gameEngine = new GameEngine();
 * gameEngine.setDifficulty(100, 50, 10);
 * 
 * // Initialize Player with a weapon
 * Weapon playerWeapon = new Weapon("Sword", gameEngine.weaponDamage);
 * Player player = new Player("John", gameEngine.startHp, playerWeapon);
 * 
 * // Initialize Monster and Boss
 * Monster monster = new Monster("Goblin", 30, 5, 10, 20);
 * Boss boss = new Boss("Dragon", 100, 20, 50, 100);
 * 
 * // Initialize Shop and Menu
 * Shop shop = new Shop();
 * Menu menu = new Menu();
 * 
 * // Start the game
 * gameEngine.startGame();
 * 
 * // Run the game loop
 * gameEngine.gameLoop();
 * 
 * // Sample method calls (replace with real game logic)
 * player.attack();
 * monster.attack();
 * boss.specialAttack();
 * boss.specialDefend();
 * shop.restoreHp(player);
 * shop.upgradeWeapon(player);
 * menu.showMenu();
 * menu.navigate();
 * 
 * // End the game
 * gameEngine.endGame();
 * }
 * }
 */