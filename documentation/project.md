# Äventyret Väntar: Slåss mot Monster, Samla Erfarenhetspoäng och Mästra Koden! 🐉🌟

## Introduktion

Välkommen till en utmaning som kommer att testa dina kodningsfärdigheter och hjälpa dig utvecklas som programmerare. I denna två veckors laboration kommer du att skapa ett textbaserat spel som inte bara kräver skicklighet i programmering utan också förmågan att sammanfoga olika kodkomponenter till en välfungerande helhet. Är du redo att ta dig an utmaningen och bevisa din expertis?

### Syfte

Syftet med denna laboration är att fördjupa din förståelse för programmering och ge dig möjlighet att använda dina kunskaper i praktiken. Du kommer att få uppleva hur olika delar av kod kan samverka för att skapa en fungerande applikation.

### Uppdraget

Ditt uppdrag är att skapa ett textbaserat spel där spelaren ställs inför utmaningar i form av monster och måste samla erfarenhetspoäng genom att besegra dem. Spelet består av 10 nivåer, och din uppgift är att se till att det blir en spännande och utmanande resa.

### Kreativ Frihet

Det bästa med den här laborationen är att ni har viss frihet att utforma spelet efter din egen vision. Ni kommer att få möjlighet att skapa en unik spelupplevelse inom de ramar som vi har satt upp. Det är er chans att vara kreativa och använda er fantasi för att bygga något speciellt.

Nu är det dags att dyka in i kodens värld. Ta din tid, planera noggrant och börja skapa ditt äventyr. Din kodresan börjar nu, och med rätt färdigheter och beslutsamhet kan du bli en mästare på programmering! 💪💻

Läs informationen från [Electronic Farts VD](./background.md)

---

## Spelets Uppbyggnad

Spelets struktur och fantasyvärld är upp till er att bestämma.

***Men det finns vissa krav som måste uppfyllas.***

### Menysystem

#### Första vyn

När spelet börjar ska följande visas för användaren

```text
Välkommen till Äventyret!

Du är en modig och äventyrlig person som har bestämt dig för att utforska en mystisk värld fylld med monster och skatter. 
Du har hört att det finns en skatt gömd i en grotta i närheten. 
Du har också hört att det finns en mystisk portal som kan ta dig till en annan värld. 
Du har bestämt dig för att utforska båda.

Säg mig, vad är ditt namn?

```

När spelaren matat in sitt namn kommer huvudmenyn.

#### Huvudmenyn

Utseende på huvudmenyn

```text
[1] - Gå på äventyr
[2] - Visa information om spelaren
[8] - Besök butiken
[9] - Avsluta spelet
[0] - Ändra svårighetsgrad
```

#### 1. Gå på äventyr 🐲🛡️

Detta startar ett nytt äventyr och tar dig igenom nivåerna i spelet.

För varje äventyr är det 90% risk att stöta på ett monster vilket inleder en strid.
Vid varje strid turas Player och Monster om att attackera och den som först blir av med all sin HP är förloraren.
Player börjar att attackera i 80% av striderna.

Om Player vinner utdelas en belöning och huvudmenyn visas.
Här kan nästa äventyr startas och jakten på Nivå 10 kan fortsätta.

Om Monster lyckas vinna striden är spelet över.

Oavsett om Player har turen att undvika en strid eller inte så kommer en belöning att utdelas i slutet av äventyret.

---

#### 2. Visa Information om Spelaren 📜

Här kan du se följande om din karaktär

- name
- level
- xp
- hp
- gold
- weapon
- monsterEncounters

---

#### 8. Besök Butiken 🛒

I butiken kan du välja att antingen uppgradera ditt vapens damage eller fylla på din HP.

***Exempel på vy***

```text
Saldo: [Här visas spelarens goldAmount]

[1] - Weapon +10 damage | - 75 gold
[2] - Player 100% HP    | - 100 gold

[0] - Tillbaka till huvudmenyn
```

⭐ *Pluspoäng om val som kostar mer än aktuellt saldo inte visas.*

---

#### 9. Avsluta Spelet 🏁

🏆 När du klarat dig förbi nivå 10 avslutas spelet automatiskt.

🏳️ *Om du vill ge upp innan kan du använda denna funktion.*

---

#### 0. Ändra svårighetsgrad

Här kan du bestämma svårighetsgrad för spelet.

Det ska finnas **3** val

- Easy
- Medium
- Hard

Ändringar här ska påverka följande egenskaper i GameEngine

- startHp
    - Mängden HP som Player startar spelet med.
- levelXp
    - Mängden XP som krävs för att avancera till nästa nivå.
- weaponDamage
    - Mängden Damage som Weapon har vid spelets start.

***Detta kan endast göras innan ett nytt spel har påbörjats.***

*Ni väljer själva hur ni gör för att lagra värdena för varje svårighetsgrad.*

---

## Sammanfattning av spelets funktionalitet

### Gå på äventyr

#### Monster

- Vid varje äventyr är det 90% risk att stöta på ett monster.
    - Om detta sker inleds en strid.
        - Player och monster turas om att attackera.
            - Player attackerar först i 80% av striderna.
    - Tryck på "Enter" mellan varje omgång för att fortsätta kampen.

##### Vinst mot monster

- Se Rewards

##### Förlust mot monster

- Spelet avslutas.

#### Rewards

- Om Player lyckas besegra monstret utdelas en belöning.
    - XP
        - Player tilldelas en bestämd mängd XP.
    - Gold
        - Player tilldelas en bestämd mängd Gold.

Om det är en `BOSS` som besegras ska belöningen multipliceras med hjälpa av metoden `multiplyRewards()`

#### Efter varje äventyr

- Efter varje avklarat äventyr utdelas en belöning.
    - XP
        - Player tilldelas en bestämd mängd XP.
    - Gold
        - Player tilldelas en bestämd mängd Gold.

***Detta utdelas oavsett om Player stött på ett Monster eller ej.***

#### Ny Level

- Efter varje avklarad Level ökar total HP för player med ett bestämt värde.
    - HP fylls även på med en randomiserad mängd.

#### Shop

- I Shop kan Player välja att uppgradera sitt Weapon eller fylla sitt HP till 100%.
    - Kostnaden för detta ska dras från goldAmount.

#### Boss

- När spelaren går på äventyr är risken för att möta en Boss baserad på aktuell Level.

| Level | Risk att möta monster |
|:-----:|-----------------------|
|   1   | 1%                    |
|   2   | 2%                    |
|   3   | 3%                    |
|   4   | 4%                    |
|   5   | 30%                   |
|   6   | 6%                    |
|   7   | 7%                    |
|   8   | 50%                   |
|   9   | 9%                    |
|  10   | 99%                   |

## Klasser

### Player

Klass för spelare.

#### Egenskaper för Player

- name
- level
- xp
- hp
- weapon
- goldAmount
- monsterEncounters

#### Metoder för Player

- attack()

---

### Monster

Basklass för alla typer av monster.

#### Egenskaper för Monster

- name
- hp
- damage
- goldReward
- xpReward

#### Metoder för Monster

- attack()

*Minst en subklass till Monster ska skapas och användas i spelet.*

---

### Boss

En klass för de svåraste monstren.

#### Egenskaper för Boss

- name
- hp
- damage
- goldReward
- xpReward

#### Metoder för Boss

- specialAttack()
- specialDefend()
- multiplyRewards()

**`Boss` ska vara en subklass till `Monster`**

---

### Weapon

En klass för spelets vapen.

#### Egenskaper för Weapon

- name
- damage

---

### Shop

En klass för spelbutiken.

#### Egenskaper för Shop

- weaponUpgradeCost
- hpRestoreCost

#### Metoder för Shop

- restoreHp()
- upgradeWeapon()

---

### Menu

En klass för spelets meny och användargränssnitt.

#### Metoder för Menu

- showMenu()
- getInput()
- navigate()

---

### GameEngine

En klass för att hantera spelets logik.

#### Egenskaper för GameEngine

- startHp
- levelXp
- weaponDamage
- gameStarted

#### Metoder för GameEngine

- startGame()
- endGame()
- gameLoop()
- setDifficulty()

---

[Betygskriterier](./requirements.md)
