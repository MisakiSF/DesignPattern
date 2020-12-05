package dpObserver.implementationCours;

public class ObserverConcretImp1 implements Observer {
    @Override
    public void update(Observable observable) {
        //casting car getstate makaynach
        System.out.println("Observateur 1");
        int state=((ObservableConcret)observable).getState();
        System.out.println("Resultat : "+state*3);
    }
}
