# Calculateur de taille de selle de dragon

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

## Capturer le problème de performance avec JFR

Avec le JDK 21, le plugin Starter Profiler de VisualVM ne permet plus de
capturer le problème de performance. La capture doit être réalisée avec Java
Flight Recorder (JFR).

Depuis la racine du projet, exécutez la commande suivante :

```bash
./gradlew clean jar && java -XX:StartFlightRecording=filename=dragon.jfr,settings=profile,dumponexit=true -jar build/libs/dragon-saddle-size-checker-1.0-SNAPSHOT.jar
```

Reproduisez le problème de performance, puis attendez la fin du programme ou
arrêtez-le avec `Ctrl+C`. Le snapshot `dragon.jfr` est alors généré à la racine
du projet.

VisualVM peut être utilisé uniquement pour ouvrir et analyser le snapshot JFR.
Il ne permet pas de démarrer cette capture avec le JDK 21.

### Calculer la taille de la selle d'un dragon pour l'année en cours

"./gradlew run

Cela vous donnera une estimation appropriée pour l’année en cours (par défaut).

### Calculer la taille de la selle d'un dragon pour N'IMPORTE QUELLE année

Vous pouvez effectuer votre calcul pour n'importe quelle année en utilisant *--args <yyyymmdd>* 
Par exemple

Gradlew Run --args 2019 

Ainsi, vous calculerez la taille de la selle d’un dragon pour l’année 2019. 
