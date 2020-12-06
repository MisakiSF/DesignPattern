## Guess What dp Is It ?
Créer les diagrammes de classes en mentionnant les designs patterns appropriés pour les situations
suivantes : 
### Question 1 : 
<p>Une figure peut être soit un cercle, un rectangle ou un groupe de figures.</p>  

### Question 2 : 
<p>Un plugin contient une opération implémentant le squelette d’un algorithme dont deux parties
(partie1 et partie2) sont variables. On voudrait laisser le développeur la possibilité
d’implémenter les deux parties manquantes de cet algorithme et on voudrait aussi que
l’application cliente puisse instancier une implémentation concrète du plugin sans connaitre sa
classe d’implémentation.</p>  

### Question 3 : 
<p>Une classe « Traitement » contient entre autres deux opérations :
 - int[] trier(int[] liste) : qui permet de trier une liste de données
 - byte[] compresser(int[] liste) : qui permet de compresser une liste de
données
Les algorithmes définis par ces deux opérations changent dans le temps. On voudrait
rendre la classe Traitement extensible en permettant à l’utilisateur de définir de nouvelles
implémentations de ces méthodes. En plus, on voudrait rendre les algorithmes de chaque
famille interchangeables au moment de l’exécution.</p> 
 
### Question 4 : 

<p>On dispose d’un composant implémentant une interface qui définir une opération
« traitement() ». On voudrait rattacher à ce composant des responsabilités supplémentaires
sans modifier son code source. C'est-à-dire envelopper l’exécution de la méthode traitement
par d’autres traitements avant et après son exécution. </p> 

### Question 5 : 
<p>On désire créer une classe Joueur ayant un état représenté par une variable score de type int.
On voudrait que les objets de l’environnement du jeu (Couloir, Caméra et Gardien) soient
informés à chaque fois que le score du joueur change tout en gardant un couplage faible entre
la classe Joueur et les autres classes.</p> 
