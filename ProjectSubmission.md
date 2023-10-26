# Enskild inlämningsuppgift

## Innehåll

- [1. Inledning](#1-inledning)
    - [1.1 Bakgrund](#11-bakgrund)
    - [1.2 Frågeställningen](#12-frågeställningen)
    - [1.3 Avgränsning](#13-avgränsning)
        - [1.3.1 Ni ska använda](#131-ni-ska-använda)
        - [1.3.2 Ni får använda](#132-ni-får-använda)
        - [1.3.3 Dvs inga](#133-dvs-inga)
        - [1.3.4 Frivilligt](#134-frivilligt)
    - [1.4 Mål](#14-mål)
    - [1.5 Syfte](#15-syfte)
    - [1.6 Vad ska ni leverera?](#16-vad-ska-ni-leverera)
- [2. Projekt Uppgift](#2-projekt-uppgift)
- [3. Betygskrav](#3-betygskrav)
    - [3.1 Grundläggande Krav](#31-grundläggande-krav)
        - [3.1.1 Funktionalitet](#311-funktionalitet)
        - [3.1.2 Dokumentation i mappen documents för projektet](#312-dokumentation-för-projektet)
        - [3.1.3 Personliga reflektioner](#313-gruppens-reflektioner)
        - [3.1.4 Personliga reflektioner](#314-personliga-reflektioner)
- [4. Sista inlämningstid](#4-sista-inlämningstid)

## 1 Inledning

Nu är det dags att använda kursens kunskaper i en praktisk uppgift.

**OBS** ni ska inte göra en **FORK** på er uppgift.

### 1.1 Bakgrund

Ni är nu i slutet på kursen, nu är det dags att sätta ihop allt ni lärt er och skapa en större applikation.

I mappen `documents` finns det två filer som ni **ska** läsa igenom:

- Backgrundsbeskrivning: [background.md](documentation/background.md)
- Uppgiften finns beskriven här: [project.md](documentation/project.md).

### 1.2 Frågeställningen

Ni ska skapa en applikation som uppfyller kraven i dokumentet [requirements.md](documentation/requirements.md).

### 1.3 Avgränsning

#### 1.3.1 Ni ska använda:

- Java OpenJDK 21 LTS

#### 1.3.2 Ni får använda:

- IntelliJ IDEA
- Visual Studio Code

#### 1.3.3 Dvs inga:

- Inga andra språk än Java
- Inga former av paket som inte är standard i Java

#### 1.3.4 Frivilligt

- Skapa extra funktionalitet som kan vara roligt att visa till er redovisning.

### 1.4 Mål

Ni behöver fylla i de fördefinierade metoderna som existerar i inlämningen för att få godkänt eller högre betyg där det
är applicerbart.

### 1.5 Syfte

- Är att ni ska använda er av kunskaperna från veckans föreläsningar.
- Är att förstärka studenternas kunskaper i programmering genom att erbjuda dem en verklig situation där
  de kan tillämpa veckans kunskaper.

### 1.6 Vad ska ni leverera?

- En applikation som uppfyller kraven i dokumentet [requirements.md](documentation/requirements.md).
- En personlig reflektion i filen [`personal_reflections.md`](documentation/reflections/student_1/personal_reflections.md) i
  mappen `documents` där ni beskriver hur ni har tänkt
  och resonerat under arbetets gång. Fyll i under respektive passande rubrik.

## 2 Projekt Uppgift

Se till att ni har läst igenom dokumentet [requirements.md](documentation/requirements.md) innan ni börjar.

## 3. Betygskrav

[Inlämningsspecifika krav](#3-betygskrav)

#### Projektet skall fungera som avsett av utbildaren, vid oklarheter fråga!

_Möts inte detta kriteriet så är man underkänd per automatik!_

Ingen tid kommer att läggas på er inlämning och er inlämning kommer **inte** rättas alls om den inte är komplett och
klarat de automatiska testerna!

Det vill säga, att om er applikation inte uppfyller alla krav så kommer er inlämning inte att bli rättad och ni får
således inte heller någon feedback!

### 3.1 Grundläggande krav

- [ ] Studenten har korrekt implementerat alla grundläggande funktioner och programmet fungerar som förväntat.
- [ ] Förbereda en max 15 min redovisning på vad ni gjort och hur ni gjort det. Ni ska kunna svara på frågor om er
  inlämning. Powerpoint eller liknande är inte ett krav.

#### 3.1.1 Funktionalitet

<table>
	<tr>
		<th>Område</th>
		<th>G-nivå</th>
		<th>VG-nivå</th>
	</tr>
    <tr>
        <td>Planering</td>
        <td>Enklare projektplan</td>
        <td>Upprätta en genomarbetad projektplan som revideras vid behov</td>
    </tr>
    <tr>
        <td>Kod stil</td>
        <td>Lättläst kod med kommentarer om nödvändigt</td>
        <td>Skriv så tydlig kod så kommentarer ofta blir onödiga. Där du använder kommentarer ska de <strong><em>noggranna och utförliga/tydliga</em></strong></td>
    </tr>
    <tr>
        <td>Läsbarhet</td>
        <td>**Lättläst kod.**</td>
        <td><strong>Väldigt lättläst kod</strong> dvs någon med kunskaper motsvarande den nivå ni befinner er på nu, ska kunna läsa och förstå er kod.</td>
    </tr>
    <tr>
        <td>Struktur</td>
        <td>Tydlig namngivning av variabler och funktioner</td>
        <td>Majoriteten av din kod ska bestå av strukturerade komponenter samt återanvända komponenter. Arbeta enligt <strong>DRY-principen</strong> (Do Not Repeat you’re self) samt Clean Code principer</td>
    </tr>
    <tr>
        <td>Kontroll</td>
        <td>Gör en enklare kontroll så att dina funktioner fungerar som de ska.</td>
        <td>Kontrollera att dina funktioner inte har sidoeffekter, dvs se till så att det inte finns uppenbara programlogiska fel.</td>
    </tr>
</table>

#### 3.1.2 Dokumentation för projektet

<table>
	<tr>
		<th>Område</th>
		<th>G-nivå</th>
	</tr>
    <tr>
        <td>README.md</td>
        <td>
            <ul>
                <li>Hur man driftar hela projektet</li>
                <li>Hur man startar/stoppar de olika delarna</li>
                <li>Allt som behövs för att vem som helst ska kunna starta projektet på sin dator</li>
                <li>Använd korrekta begrepp och syntax i dina beskrivningar.</li>
            </ul>
        </td>
    </tr>
</table>

#### 3.1.3 Gruppens reflektioner

<table>
	<tr>
		<th>Område</th>
		<th>G-nivå</th>
	</tr>
    <tr>
        <td>personal_reflections.md</td>
        <td>
            <ul>
                <li>Fyll i under alla rubriker</li>
                <li>3-5 meningar per rubrik!</li>
            </ul>
        </td>
    </tr>
</table>

#### 3.1.4 Personliga reflektioner

<table>
	<tr>
		<th>Område</th>
		<th>G-nivå</th>
		<th>VG-nivå</th>
	</tr>
    <tr>
        <td>personal_reflections.md</td>
        <td>
            <ul>
                <li>Fyll i under alla rubriker fram till VG</li>
                <li>2-3 meningar per rubrik!</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Fyll även i rubrikerna under VG</li>
                <li><strong>3 -5 meningar per rubrik</strong>, detta gäller bara under VG-delen</li>
            </ul>
        </td>
    </tr>
</table>

_För att få **VG** på uppgiften ska du även fylla i VG delen i dokumentet._

Detta innebär:

1. `README.md`-fil i projektets rotmapp.
2. `group_reflections.md`-fil i mappen `documents/reflections/group_reflections.md`.
3. `personliga_reflektioner.md`-fil i mappen `documents/reflections/00abcxyz/personliga_reflektioner.md` för varje gruppmedlem.
4. Alla filer ska finnas kvar i roten på ert projekt, annars kommer inlämningen underkännas.

## 4. Sista inlämningstid

Muntlig presentation kommer att hållas den `2023-10-26` från kl. `9:00:00` och frammåt.

Deadline för inlämning är senast den `2023-10-29` kl. `23:59:59`.

**_Efter Deadline kan ni inte få högre betyg än G._**

* Ni kan göra färdigt er uppgift efter deadline men ni hamnar sist i prioritering med att rättas.
* Om ni inte lämnar in något alls får ni IG på er inlämning.
* Om ni inte lämnar in i tid får ni en ny individuell inlämningsuppgift att göra med högsta möjliga betyg G.
* Inlämningar ska ske via SchoolHub´s plattform på [gitlab.dsve.se](https://gitlab.dsve.se/)

Frågor? Återkom till utbildaren via Google Meet/Teams/Discord eller maila mig på `marmed02@gafe.molndal.se`.

_OBS! Är det frågor som fler än du själv har nytt av att få svar på, använd er av Discord kanalen för frågor och svar._
