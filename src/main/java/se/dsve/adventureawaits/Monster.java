package se.dsve.adventureawaits;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class Monster {
    public String name;
    public int gold;
    public int hp;
    protected int damage;
    protected int goldReward;
    protected int xpReward;


    public String getName() {
        return name;
    }

    public int getGoldReward() {
        return goldReward;
    }

    public int getXpReward() {
        return xpReward;
    }

    public Monster() {
        // Default constructor
    }

    public Monster(String name, int hp, int damage, int goldReward, int xpReward) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.goldReward = goldReward;
        this.xpReward = xpReward;
    }

    public void attack(Player player) {
        // Skriv din kod här
        if (player.currentHp > 0) {
            player.currentHp = player.currentHp - damage;
        }
        else if (player.currentHp <= 0) {
            System.out.println("Du dog.");
        }
    }
}
