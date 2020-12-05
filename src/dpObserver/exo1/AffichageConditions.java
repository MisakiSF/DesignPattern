package dpObserver.exo1;

public class AffichageConditions implements Observer {
    @Override
    public void update(float temperature, float hygrometrie, float pression) {
        System.out.println("++++++++++++++++");
        System.out.println("Affichage conditions actuelles");
        System.out.println("Temperature = "+temperature);
        System.out.println("Hygrometrie = "+hygrometrie);
        System.out.println("Pression = "+pression);
    }
}
