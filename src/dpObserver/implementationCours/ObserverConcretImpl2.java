package dpObserver.implementationCours;

public class ObserverConcretImpl2 implements Observer {
    @Override
    public void update(Observable observable) {
        //casting car getstate makaynach
        System.out.println("Observateur 2");
        int state=((ObservableConcret)observable).getState();
        System.out.println("Resultat : "+state*6);
    }
}
