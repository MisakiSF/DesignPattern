## EXERCICE 1 
### Cahiere De Charge
<p>On souhaite concevoir et développer un Framework qui permet d’effectuer un traitement sur une
image. L’image étant représentée par un tableau d’entiers. La signature de la méthode est la suivante :
int[] traiter(int[] image).</p>

Le Framework doit satisfaire les conditions suivantes :
- Il doit être fermé à la modification et ouvert à l’extension.
- Le traitement à effectuer peut évoluer dans le temps. Cela signifie que l’utilisateur de
l’application peut, lui-même, définir de nouvelles implémentations du traitement.
- Au moment de l’exécution, on peut changer dynamiquement la version de l’implémentation
du traitement à appliquer à l’image.
- L’application ne peut utiliser le Framework qu’en un seul exemplaire (instance unique)
- Permettre au Framework d’utiliser une ancienne implémentation (ImplNonStandard) qui
permet de traiter une image représentée par une matrice d’entiers. 


### Conception
realiser le diagramme de classe ainsi que celui de sequence.
