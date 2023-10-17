package se.dsve.adventureawaits;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class Shop {
    // Variabel för att hålla i priserna för olika tjänster.
    public int weaponUpgradeCost = 75;
    public int hpRestoreCost = 100;

    public  void restoreHp(Player player) {

        //Denna metod tar bort hpRestoreCost från spelarens goldAmount, fyller på spelarens currentHp till totalHp-nivån och skriver ut att man är frisk.

        player.goldAmount =- hpRestoreCost;
        player.currentHp = player.totalHp;
        System.out.println("Nu är du helt frisk igen.");
    }

    public  void upgradeWeapon(Player player) {

        //Denna metod tar bort weaponUpgradeCost från spelarens goldAmount, höjer vapens damage med 10 och skriver ut ett meddelande till spelaren.

        player.goldAmount =- weaponUpgradeCost;
        player.weapon.damage =+ 10;
        System.out.println("Din svärd är nu vassare.");

    }

    public static void showMenu(Player player) {
        // Finns redan en metod för det i Menu.java.
    }
}


