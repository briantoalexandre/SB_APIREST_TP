# TP ApiSeries

**Version :** 2025-26

## Description :
Application exécutant un server **API REST** sur la thématique des séries.

## Spécifications techniques :
- **Java** et **JDK** en version **21**
- 1 serveur de base de données : **MySQL** ou **MariaDB**
- L'application s'appuie sur le framework **Spring Boot** et de **Gradle** pour la gestion des dépendances, un accès à Internet est donc nécessaire pour que **SpringBoot** et **Gradle** puissent récupérer les dépendances sur leurs dépôts.

## Configuration pour l'accès à la base de données :

### Comportement de l'application avec son SGBD :
La base de donnée sera automatiquement créer par l'application si cette dernière n'existe pas. Les tables et leurs enregistrements sont créés à chaque démarrage de l'application et sont entièrement supprimées si l'application est arrêtée proprement.

#### Configuration de la connexion :
Le fichier `./src/main/resources/application.properties` doit être correctement renseigné pour permettre la connexion à la base de données.

```
spring.application.name=ApiSeries
spring.datasource.url=jdbc:mariadb://localhost:3306/dbSerie?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=create-drop
```

#### Valorisation des tables :
La valorisation des tables de la base de données est réalisée par le fichier : `./src/main/resources/import.sql`

```sql
-- Exemple de données pour la table "Serie"
INSERT INTO serie (nom, lien_image, vo, premise) VALUES('Breaking Bad', 'breaking_bad.jpg', 'anglais', 'Un professeur de chimie devient un baron de la drogue.'),('Game of Thrones', 'game_of_thrones.jpg', 'anglais', 'Une lutte pour le trône de fer dans un monde fantastique.'),('Stranger Things', 'stranger_things.jpg', 'anglais', 'Des événements étranges se produisent dans une petite ville.'),('Friends', 'friends.jpg', 'anglais', 'Les aventures de six amis à New York.'),('The Crown', 'the_crown.jpg', 'VO', 'La vie de la reine d Angleterre.');

INSERT INTO genre (nom ) VALUES('Drame'),('Crime'),('Fantaisie'),('Science-Fiction'),('Horreur'),('Comédie'),('Biographie'),('Histoire');

INSERT INTO genre_series (genre_id, series_id) VALUES (1, 1),(2, 1),(3, 2), (1, 2), (4, 3), (5, 3), (6, 4), (1, 4), (7, 5), (8, 5);

INSERT INTO saison (num, nom, annee, nombre_episode, serie_id) VALUES (1, 'Saison 1', 2008, 7, 1),(2, 'Saison 2', 2009, 13, 1),(1, 'Saison 1', 2011, 10, 2),(2, 'Saison 2', 2012, 10, 2),(1, 'Saison 1', 2016, 8, 3),(2, 'Saison 2', 2017, 9, 3),(1, 'Saison 1', 1994, 24, 4),(2, 'Saison 2', 1995, 24, 4),(1, 'Saison 1', 2016, 10, 5),(2, 'Saison 2', 2017, 10, 5);
```


