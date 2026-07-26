# Calculateur de taille de dragon

# Cette branche

Cette branche contient une version de l'application qui a été transformé en Spring Boot service.

## Étape 1 — Mise à jour vers Spring Boot 2.1.18

L'application utilise désormais Spring Boot `2.1.18.RELEASE`, la dernière
version corrective de la branche Spring Boot 2.1. Le wrapper Gradle reste en
version 4.10.3 pour cette étape.

La validation de cette étape est effectuée avec :

```bash
./gradlew clean build
```

## Étape 2 — Mise à jour vers Gradle 5.6.4

Le Gradle Wrapper utilise désormais Gradle 5.6.4, dernière version de Gradle
5 compatible avec Spring Boot 2.1.18.

Gradle 4.10.3 fonctionnait avec le JDK 21. Gradle 5.6.4 doit toutefois être
exécuté avec un JDK 11 : le retour temporaire à ce JDK est une contrainte de
cette étape de migration, car le build ne fonctionne pas encore avec le JDK 21.

La validation de cette étape est effectuée avec :

```bash
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
PATH=/usr/lib/jvm/java-11-openjdk-amd64/bin:$PATH \
./gradlew clean build --no-daemon
```

## Étape 3 — Mise à jour vers Spring Boot 2.3.12

L'application utilise désormais Spring Boot `2.3.12.RELEASE`. Gradle 5.6.4 et
le JDK 11 sont conservés pour cette étape.

La validation de cette étape est effectuée avec :

```bash
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
PATH=/usr/lib/jvm/java-11-openjdk-amd64/bin:$PATH \
./gradlew clean build --no-daemon
```

## Étape 4 — Mise à jour vers Gradle 6.8.3

Le Gradle Wrapper utilise désormais Gradle 6.8.3, version compatible avec
Spring Boot 2.3.12. Le JDK 11 est conservé pour exécuter et valider le build.

La validation de cette étape est effectuée avec :

```bash
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
PATH=/usr/lib/jvm/java-11-openjdk-amd64/bin:$PATH \
./gradlew clean build --no-daemon
```

## Étape 5 — Préparation à Gradle 7

Les configurations de dépendances de test dépréciées `testCompile` sont
remplacées par `testImplementation`. Cette mise à jour prépare le projet à
Gradle 8 sans modifier les versions de ses dépendances.

La validation de cette étape est effectuée avec :

```bash
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
PATH=/usr/lib/jvm/java-11-openjdk-amd64/bin:$PATH \
./gradlew clean build --warning-mode all --no-daemon
```

## Étape 6 — Mise à jour vers Spring Boot 2.7.18

L'application utilise désormais Spring Boot `2.7.18`, dernière version
corrective de la ligne 2.x. Gradle 6.8.3 reste exécuté avec le JDK 11 à cette
étape.

La validation de cette étape est effectuée avec :

```bash
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64 \
PATH=/usr/lib/jvm/java-11-openjdk-amd64/bin:$PATH \
./gradlew clean build --warning-mode all --no-daemon
```

## Étape 7 — Mise à jour vers Gradle 8.14.3 et JDK 21

Le Gradle Wrapper utilise désormais Gradle 8.14.3. Cette version permet
d'exécuter Gradle avec le JDK 21, compatible avec Spring Boot 2.7.18.

La configuration Gradle utilise aussi les API modernes `java` et `application`.
Le lanceur JUnit Platform est déclaré explicitement afin de supprimer les
dépréciations propres au build. L'avertissement restant provient du plugin
Spring Boot 2.7 et sera traité lors de la migration Spring Boot suivante.

La validation de cette étape est effectuée avec :

```bash
./gradlew clean build --warning-mode all --no-daemon
```

# Le bug qui a vaincu un dragon
Comme chacun sait, les dragons sont des créatures mythiques qui n'existent pas dans la nature. Pas naturellement, en fait.

Ce que vous ne savez peut-être pas, c'est qu'en l'an 1 de notre ère, le sage alchimiste Lou Tan Dey-ta a réussi à créer plusieurs dragons en utilisant des moyens non naturels et un certain nombre de potions pétillantes.
Ces dragons volent encore dans le ciel aujourd'hui.

Les dragons vivent extrêmement longtemps et grandissent à un rythme constant, mais lent.
Acheter la bonne selle de dragon est une affaire délicate.

Afin d'aider ceux qui ont la chance de monter un jour sur ces dragons,
Lou Tan a publié un algorithme de calcul de la taille d'une selle basé
sur l'âge d'un dragon.

Des siècles plus tard, cet algorithme a été réécrit à la hâte en Java afin d'aider ceux qui ont la chance d'avoir besoin de selles de dragon.

Malheureusement, le code laisse beaucoup à désirer : il y a maintenant un bug.

# Exécution de cette application

### Calculer la taille de selle d'un dragon en fonction de l'année

`./gradlew bootRun`

Cela démarrera votre application.

* Visit http://localhost:9999/dragon/size pour voir le calcul pour l'année en cours
* Visit http://localhost:9999/dragon/size/year/2019 pour voir le calcul pour l'année 2019.
