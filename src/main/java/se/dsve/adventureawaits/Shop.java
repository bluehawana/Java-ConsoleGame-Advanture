package se.dsve.adventureawaits;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class Shop {
    public int weaponUpgradeCost;
    public int hpRestoreCost;

    public  void restoreHp(Player player) {
        // Skriv din kod här
    }

    public  void upgradeWeapon(Player player) {
        // Skriv din kod här
        // Tips: Använd player.weapon.damage för att öka skadan med 10 %
    }

    public static void showMenu(Player player) {
        // Skriv din kod här
        // Skriv ut saldot för spelaren och alternativen i shoppen
    }
}
