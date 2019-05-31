# TP Final MDI

L'objectif de ce TP était de réaliser une API rest capable d'intérargir avec une base de données, et une SPA effectuant des requête vers cette API.

Pour les données nous avons choisi le modèle le plus simple possible: 
- un utilisateur composé d'un nom et d'un id.
- Un évènement composée d'un nom et d'une liste d'utilisateur.

Puis nous avons réaliser une API à l'aide de Rest Easy et de l'ORM hibernate afin de pouvoir créer un évènement, y ajouter des utilisateur, et obtenir les données de l'évènement.

La partie la plus compliqué de ce TP a été de trouver comment lancer l'api REST, ce que nous faisont à l'aide du plugin maven jetty, et nous spécifions la ressource REST à lancer dans application/MyApp.java.
C'est également dans ce fichier que l'on autorise les requêtes CORS, ce qui est nécéssaire afin de pouvoir appeler l'API depuis un navigateur.

Pour tester notre application il suffit d'utiliser le docker-compose se trouvant dans le dossier docker, et il va lancer la base de donnée sur le port 9001, l'api sur le port 8080, et le front sur le port 3000.

Lien vers le repo git du front: [TPFINAL-MDI-FRONT](https://github.com/Gillian-B/TPFINAL-MDI-FRONT)
