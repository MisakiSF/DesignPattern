package dpObserver.implementationCours;

public interface Observable {

    // cette  methode permet a l utilisateur de s'inscrire et de s'enregistrer
    public void addObserver(Observer observer);

    //cette methode pour s'abonner ou bien d'esabonner
    public void deleteObserver(Observer observer);

    //cette methode permet a observable de notifier touts les observateur a chaque fois que son etat va changer
    public void notifyObservers();
}
