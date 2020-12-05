package dpObserver.exo1;

public class App {
    public static void main(String[] args) {
        DonneeMeteo dm=new DonneeMeteo();

        AffichageConditions observer1 =new AffichageConditions();
        dm.addObserver(observer1);

        Prevision observer2 =new Prevision();
        dm.addObserver(observer2);

        dm.setDonneMeteo(34,60,1000);
        dm.setDonneMeteo(34,60,2000);
        dm.setDonneMeteo(34,60,2500);

    }
}
