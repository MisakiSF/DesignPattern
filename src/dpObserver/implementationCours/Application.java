package dpObserver.implementationCours;

public class Application {

    public static void main(String[] args) {
        //le sujet qui est observer
       ObservableConcret sujet=new ObservableConcret();
       ObserverConcretImp1 observer1=new ObserverConcretImp1();
       //enregistrer un observateur
        sujet.addObserver(observer1);
       ObserverConcretImpl2 observer2=new ObserverConcretImpl2();
       sujet.addObserver(observer2);

       //setEtat se change d'etat
       sujet.setState(8);
       //exemple de remove
        sujet.deleteObserver(observer2);
       sujet.setState(7);


    }
}
