package dpState;

public class Application {
    public static void main(String[] args) {
        Avion avion=new Avion();
        avion.doAction();
        avion.decoller();
        avion.doAction();
        avion.sortieDuGarage();
        avion.doAction();
        avion.atterir();
        avion.entrerAuGarage();
        avion.sortieDuGarage();
        avion.decoller();
        avion.doAction();
        avion.entrerAuGarage();
        avion.sortieDuGarage();
        avion.atterir();
        avion.doAction();
        avion.entrerAuGarage();
        avion.doAction();
    }
}
