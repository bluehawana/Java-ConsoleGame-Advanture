package se.dsve.adventureawaits;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class Weapon {
    public String name;
    public int damage;

    public Weapon() {
        //En konstruktör för en svärd med damage 10.
        this.name = "sword";
        this.damage = 10;
    }

    public Weapon(String weaponName, int weaponDamage) {
        this.name = weaponName;
        this.damage = weaponDamage;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for damage
    public int getDamage() {
        return damage;
    }

    // Setter for damage
    public void setDamage(int damage) {
        this.damage = damage;
    }
}