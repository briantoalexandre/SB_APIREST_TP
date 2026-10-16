# Journal de suivi TP APISERIE :

## <u>Suivi 2025-26 :</u>

### Changement de version de Java :
La version de Java a été modifiée pour la 21 (à la place de 17). La modification a été réalisée directement dans le fichier : `../build.gradle.kts`


### Correction casse sur le nom des tables du fichier import.sql :
La valorisation des tables est réalisée à partir du fichier `../src/main/resources/import.sql` or le nom des tables commençaient par des majuscules. Sous Windows cela fonctionne, mais sous Linux l'insertion des entrées échouaient car les tables n'étaient pas trouvées.

