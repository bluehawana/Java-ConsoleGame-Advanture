package se.dsve;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

import se.dsve.adventureawaits.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.start();
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