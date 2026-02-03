# TP Géométrie – Java

## 📐 Description
Ce projet est un **TP de programmation orientée objet en Java** portant sur la modélisation de figures géométriques.
Il met en œuvre les notions de **classes, héritage, abstraction, polymorphisme** et **collections**.

Le projet permet de représenter et manipuler différentes figures géométriques à partir de points dans un plan.

---

## 🧱 Structure du projet

Le projet contient les classes suivantes :

### 🔹 `Point`
Représente un point du plan cartésien.
- Coordonnées `(x, y)`
- Nom ou étiquette du point
- Méthodes d’accès et d’affichage

---

### 🔹 `Figure` (classe abstraite)
Classe mère de toutes les figures géométriques.
- Définit les comportements communs
- Sert de base pour le polymorphisme

---

### 🔹 `Polygone`
Hérite de `Figure`.
- Défini par un tableau ou une liste de `Point`
- Représente toute figure polygonale
- Peut être spécialisée en formes concrètes

---

### 🔹 `Rectangle`
Hérite de `Polygone`.
- Défini par 4 points
- Constructeur à partir d’un point, d’une longueur et d’une hauteur
- Représente un rectangle aligné avec les axes

---

### 🔹 `Triangle`
Hérite de `Polygone`.
- Défini par 3 points
- Représente un triangle quelconque

---

### 🔹 `Main`
Classe principale de test en **mode console**.
- Création des objets
- Tests des méthodes
- Affichage des résultats

---

### 🔹 `MainGraphique`
Classe principale en **mode graphique**.
- Affichage visuel des figures
- Interaction éventuelle avec l’utilisateur
- Permet de visualiser les figures géométriques

---

## ▶️ Exécution

### Compilation
```bash
javac *.java


---
_Généré par GPT-5.2_


