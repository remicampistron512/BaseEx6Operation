# Exercice 6 : Les Opérations [BaseEx6Operation]

Cette application Java regroupe plusieurs mini-fonctions utiles pour s’entraîner :
- opérations arithmétiques de base (`add`, `sub`, `mul`, `div`)
- affichage d’un **triangle** en console
- calcul de la **somme des deux plus grands nombres** d’un tableau

Tout est exécuté dans le `main`.

## Sommaire
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Fonctionnalités](#fonctionnalités)
- [Structure-du-code](#structure-du-code)

## Installation

1. Téléchargez le fichier `Operation.java`.
2. Compilez :

   ```bash
   javac Operation.java
   ```

3. Exécutez :

   ```bash
   java Operation
   ```

## Utilisation

L’exécution affiche, dans l’ordre :

1. le résultat des 4 opérations de base sur `5` et `2` :

   * addition → `7`
   * soustraction → `3`
   * multiplication → `10`
   * division → ici `5 / 0` → message `erreur` puis `0`

2. un **triangle d’étoiles** imprimé ligne par ligne

3. le résultat de :

   ```java
   int [] intArray = {78, 6, -250, 2, 12, 9};
   System.out.println(getSumTwoHighestNumbers(intArray));
   ```

   → somme des deux plus grandes valeurs du tableau

Aucune saisie utilisateur n’est demandée.


## Fonctionnalités

* ✅ 4 opérations de base : `add`, `sub`, `mul`, `div`
* ✅ Gestion minimale de l’**erreur de division par zéro**
* ✅ Affichage d’une forme (triangle) en console
* ✅ Parcours d’un tableau d’entiers
* ✅ Recherche des **deux plus grands entiers** d’un tableau
* ✅ Exemple d’appels dans le `main`

## Structure du code

* **`main(...)`**

  * appelle toutes les démos : opérations, triangle, somme des 2 plus grands

* **Méthodes arithmétiques**

  * `add(int a, int b)`
  * `sub(int a, int b)`
  * `mul(int a, int b)`
  * `div(int a, int b)` → gère `b == 0`

* **Méthode d’affichage**

  * `triangle()` → affiche plusieurs lignes d’étoiles, avec un calcul de largeur par ligne

* **Méthode de traitement de tableau**

  * `getSumTwoHighestNumbers(int[] intArray)` → parcourt le tableau et garde en mémoire le plus grand et le deuxième plus grand

