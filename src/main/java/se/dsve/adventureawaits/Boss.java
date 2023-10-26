package se.dsve.adventureawaits;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

import java.util.Random;

public class Boss extends Monster {
    public Boss() {
        super();  // Calling the default constructor of Monster
        if (new Random().nextInt(100) < 50) {
            multiplyRewards();
        } else {
            throw new IllegalArgumentException();
        }
    }

    // Overloaded constructor to initialize Boss with specific stats
    public Boss(String name, int hp, int damage, int goldReward, int xpReward) {
        super(name, hp, damage, goldReward, xpReward); // Calling the parameterized constructor of Monster
        if (new Random().nextInt(100) < 50) {
            multiplyRewards();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void specialAttack(Player player) {
        // Skriv din kod här
        // 30 % chans att göra 50 % extra skada
        if (new Random().nextInt(100) < 30) {
            player.currentHp = player.currentHp - (int) (player.currentHp * 0.5);
        }
    }

    public void specialDefend(Player player) {
        // Skriv din kod här
        // 30 % chans att blockera 50 % av spelarens skada
        if (new Random().nextInt(100) < 30) {
            player.currentHp = player.currentHp + (int)(player.currentHp * 0.5);
        }
    }

    public void multiplyRewards() {
        // Skriv din kod här
        // 50 % extra guld och xp
        if (new Random().nextInt(100) < 50) {
            this.goldReward += (int)(this.goldReward * 0.5);
            this.xpReward += (int)(this.xpReward * 0.5);
        }
    }
}