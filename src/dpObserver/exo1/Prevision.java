package dpObserver.exo1;

public class Prevision implements Observer {
    private float p;
    @Override
    public void update(float temperature, float hygrometrie, float pression) {
        System.out.println("affichage prevision");
        if ((pression-p)>0){
            System.out.println("Amelioration en cours");
        }
        else if ((pression-p)<0){
            System.out.println("Le temps se raffraichit");
        }
        else {
            System.out.println("Depression bien installee");
        }
        p=pression;
    }

}
