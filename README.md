
# Exercice 6 : Les Opérations [BaseEx6Operation]


Ce mini-projet regroupe **deux petites applications Java** dans le même dossier :

1. **`Operation`** : démonstration d’opérations arithmétiques simples, affichage d’un triangle en console, et calcul de la somme des deux plus grands nombres d’un tableau.
2. **`Matrix`** : opérations de base sur des **matrices d’entiers** (addition, soustraction, multiplication par un scalaire) avec affichage en console.

Chaque classe possède son propre `main`, donc on peut les lancer séparément.

## Sommaire
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Fonctionnalités](#fonctionnalités)
- [Structure-du-code](#structure-du-code)

## Installation

1. Assurez-vous d’avoir **Java (JDK 8+)**.
2. Créez deux fichiers dans le même dossier :
   - `Operation.java`
   - `Matrix.java`
3. Collez le code donné dans chaque fichier.
4. Compilez les deux fichiers :

   ```bash
   javac Operation.java Matrix.java
    ```

5. Exécutez **au choix** :

   ```bash
   java Operation
   ```

   ou

   ```bash
   java Matrix
   ```

## Utilisation

### 1. Lancer `Operation`

```bash
java Operation
```

Cette exécution affiche successivement :

1. le résultat de `add(5,2)`, `sub(5,2)`, `mul(5,2)`, `div(5,0)`

   * ⚠️ pour la division par 0, le programme affiche `erreur` et retourne `0`
2. un **triangle d’étoiles** imprimé ligne par ligne
3. le résultat de `getSumTwoHighestNumbers(...)` sur le tableau :

   ```java
   int [] intArray = {78, 6, -250, 2, 12, 9};
   ```

### 2. Lancer `Matrix`

```bash
java Matrix
```

Cette exécution :

1. additionne deux matrices 3×3 (`addMatrix(firstMatrix, secondMatrix)`) et affiche le résultat
2. affiche une ligne de séparation
3. soustrait deux matrices 3×2 (`subMatrix(thirdMatrix, fourthMatrix)`) et affiche le résultat
4. affiche une ligne de séparation
5. multiplie une matrice 3×2 par un **scalaire** (`mulScalMatrix(fourthMatrix, 2)`) et affiche le résultat

Les résultats sont imprimés **ligne par ligne** dans la console.

## Fonctionnalités

### `Operation`

* ✅ `add(int, int)` – addition
* ✅ `sub(int, int)` – soustraction
* ✅ `mul(int, int)` – multiplication
* ✅ `div(int, int)` – division avec gestion de division par zéro
* ✅ `triangle()` – affichage d’une forme en console
* ✅ `getSumTwoHighestNumbers(int[])` – récupère les **2 valeurs les plus élevées** d’un tableau et en fait la somme

### `Matrix`

* ✅ `addMatrix(int[][], int[][])` – addition élément par élément
* ✅ `subMatrix(int[][], int[][])` – soustraction élément par élément
* ✅ `mulScalMatrix(int[][], int)` – multiplication d’une matrice par un scalaire
* ✅ Démonstration avec matrices pré-remplies

## Structure du code

### 1. Fichier `Operation.java`

* **`public static void main(String[] args)`**

  * appelle successivement les 4 opérations de base avec `(5, 2)`
  * appelle `triangle()`
  * crée un tableau d’entiers et appelle `getSumTwoHighestNumbers(...)`

* **Méthodes arithmétiques**

  * `add(int a, int b)` → `a + b`
  * `sub(int a, int b)` → `a - b`
  * `mul(int a, int b)` → `a * b`
  * `div(int a, int b)` → si `b == 0` → affiche `erreur` et retourne `0`

* **Méthode d’affichage**

  * `triangle()` → utilise :

    * une hauteur : `triangleHeight = 6`
    * un tableau de largeurs : `{1,3,5,7,9,11,13}`
    * deux boucles imbriquées pour imprimer des espaces puis des `*`

* **Méthode de traitement de tableau**

  * `getSumTwoHighestNumbers(int[] intArray)` :

    * parcourt le tableau
    * conserve le plus grand (`firstHighestNumber`) et le 2e plus grand (`secondHighestNumber`)
    * renvoie leur somme
    * ⚠️ initialisation à `0` → attention si le tableau contient **uniquement des valeurs négatives**

---

### 2. Fichier `Matrix.java`

* **`public static void main(String[] args)`**

  * déclare plusieurs matrices (3×3 et 3×2)
  * appelle dans l’ordre :

    * `addMatrix(...)`
    * `subMatrix(...)`
    * `mulScalMatrix(...)`
  * affiche des séparateurs `--------------`

* **`addMatrix(int[][] firstMatrix, int[][] secondMatrix)`**

  * crée une matrice résultat 3×3 remplie de `0`
  * parcourt les 2 matrices
  * additionne élément par élément
  * affiche le résultat

* **`subMatrix(int[][] firstMatrix, int[][] secondMatrix)`**

  * même logique que l’addition, mais avec une soustraction
  * matrice résultat également **codée en dur** en 3×3

* **`mulScalMatrix(int[][] matrix, int n)`**

  * multiplie chaque case de la matrice par `n`
  * affiche le résultat

