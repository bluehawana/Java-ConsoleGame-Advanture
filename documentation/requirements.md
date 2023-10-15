# Betygskriterier

## Innehåll

- [Godkänt (G)](#godkänt-g)
    - [Väldokumenterad kod](#väldokumenterad-kod)
    - [Använda relevanta Java-koncept och färdigheter](#använda-relevanta-java-koncept-och-färdigheter)
    - [Rapport](#rapport)
- [Väl Godkänt (VG)](#väl-godkänt-vg)
- [Versionshantering](#versionshantering)
- [Kunskaper och Färdigheter](#kunskaper-och-färdigheter)
- [Egenskaper och datatyper](#egenskaper-och-datatyper)
- [Metoder](#metoder)

## Godkänt (G)

### Väldokumenterad kod

Metoder i projektet ska kompletteras med tydliga och korrekta kommentarer i koden.

### Använda relevanta Java-koncept och färdigheter

Listade i tabellen "Kunskaper och Färdigheter".

### Rapport

***Gruppen***
group_reflections.md ska fyllas i och finnas med i projektet.

***Varje gruppmedlem***
personal_reflections.md ska fyllas i och finnas med i projektet.

Rapporten placeras i en separat mapp döpt efter den studerandes användarId/userId/skolId.
*Döp om befintliga mappar. Skapa extra vid behov.*

##### Exempel

```text
└───documentation
    └───reflections
    |   ├───98abcxyz
    |   |   └───personal_reflections.md
    │   ├───99defrst
    │   │   └───personal_reflections.md
    |   └───group_reflections.md
    ├── background.md
    ├── project.md
    └── requirements.md 
```

## Väl Godkänt (VG)

***Allt i Godkänt plus Utökad personlig rapport***

---

## Versionshantering

- Använd GitLab för att hantera projektet.
- Använd Git Flow som versionshanteringsstrategi.
- **Alla** gruppmedlemmar ska bidra till projektet.
- main ska vara låst så att bara Pull request kan skickas.
- Alla Pull requests ska kräva godkännande av minst en annan gruppmedlem.

---

## Kunskaper och Färdigheter

| Koncept            | Beskrivning                                                  |
|--------------------|--------------------------------------------------------------|
| Klasser och objekt | Förståelse för hur klasser och objekt fungerar.              |
| Inkapsling         | Användning av private och public.                            |
| Arv                | Användning och förståelse av `extends`.                      |
| Polymorfism        | Kunna använda flera former av en metod.                      |
| Överlagring        | Flera metoder med samma namn men olika parametrar.           |
| Interfaces         | Användning och förståelse av interfaces.                     |
| Datastrukturer     | Kunskap om olika datastrukturer som ArrayList, HashMap, etc. |
| Exceptions         | Hantera fel genom att använda try-catch.                     |
| Loops              | Kunna använda och förstå for-loopar, while-loopar.           |

---

## Egenskaper och datatyper

| Egenskap          | Datatyp | Förklaring                                                            |
|-------------------|---------|-----------------------------------------------------------------------|
| name              | String  | Namn                                                                  |
| level             | Integer | Nivå                                                                  |
| xp                | Integer | Totalt antal poäng, bestämmer Level                                   |
| totalHp           | Double  | Total hälsa                                                           |
| currentHp         | Double  | Aktuell hälsa                                                         |
| damage            | Double  | Hur mycket skada som görs vid varje attack.                           |
| reward            | Integer | Antal guld/xp som fås vid vinst                                       |
| weapon            | Weapon  | Vapen som används av Player.                                          |
| monsterEncounters | HashMap | Håller koll på antal gånger Player har stött på varje typ av monster. |
| gameStarted       | Boolean | Avgör om spelet har startats eller ej.                                |
| gameDifficulty    | String  | Svårighetsgraden för spelet.                                          |

---

## Metoder

| Metod             | Förklaring                                                                          |
|-------------------|-------------------------------------------------------------------------------------|
| attack            | Attackera motståndaren. Motståndarens HP minskar med den skada som görs             |
| specialAttack()   | 30% chans att öka skadan med 50%                                                    |
| specialDefend()   | 30% chans att halvera skadan med 50%                                                |
| multiplyRewards() | Öka rewards med en förbestämd procentsats                                           |
| restoreHp()       | Återställa HP för Player till 100%                                                  |
| upgradeWeapon()   | Uppgradera Weapon för Player                                                        |
| startGame()       | Starta Spelet                                                                       |
| endGame()         | Avsluta spelet                                                                      |
| gameLoop()        | Se till att spelet fortsätter tills att Player förlorar alt. tar sig förbi Level 10 |
| setDifficulty()   | Bestämma svårighetsgraden                                                           |
| showMenu()        | Visa menyn                                                                          |
| getInput()        | Ta emot input                                                                       |
| navigate()        | Navigera till rätt funktion baserat på input                                        |
