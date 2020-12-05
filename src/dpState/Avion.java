package dpState;

public class Avion {
    private EtatAvion etatAvion;

    public Avion() {
     etatAvion=new AuGarage();

    }

    //generate delegate methodes
    public void entrerAuGarage() {
        etatAvion.entrerAuGarage();
    }

    public void sortieDuGarage() {
        etatAvion.sortieDuGarage();
    }

    public void decoller() {
        etatAvion.decoller();
    }

    public void atterir() {
        etatAvion.atterir();
    }

    public void doAction() {
        etatAvion.doAction();
    }

    interface EtatAvion{
        public void entrerAuGarage();
        public void sortieDuGarage();
        public void decoller();
        public void atterir();
        //ce qui va faire va dependre de l'etat
        public void doAction();
    }

class AuGarage implements EtatAvion {

    @Override
    public void entrerAuGarage() {
        System.out.println("Je suis deja au Garage");
    }

    @Override
    public void sortieDuGarage() {
        System.out.println("transition d'etat au garage vers la piste");
        etatAvion = new EnPiste();
    }

    @Override
    public void decoller() {
        System.out.println("Impossible de decoller");
    }

    @Override
    public void atterir() {
        System.out.println("Impossible de decoller");
    }

    @Override
    public void doAction() {
        System.out.println("l'action relative a l etat au garage ...");
    }
}
    class EnPiste implements EtatAvion {

        @Override
        public void entrerAuGarage() {
            System.out.println("Transition de la piste vers le Garage");
            etatAvion=new AuGarage();
        }

        @Override
        public void sortieDuGarage() {
            System.out.println("je suis deja en piste");

        }

        @Override
        public void decoller() {
            System.out.println("Transition de piste vers en l'aire");
            etatAvion=new enLair();
        }

        @Override
        public void atterir() {
            System.out.println("Impossible...Je suis en piste");
        }

        @Override
        public void doAction() {
            System.out.println("Action relativea l'etat En piste..");
        }
    }
    class enLair implements Avion.EtatAvion{

        @Override
        public void entrerAuGarage() {
            System.out.println("Impossible..de passer de l'etat en l'air vers le garage");
        }

        @Override
        public void sortieDuGarage() {
            System.out.println("Pas possible");
        }

        @Override
        public void decoller() {
            System.out.println("Pas possible.....");
        }

        @Override
        public void atterir() {
            System.out.println("Transition de l'aire vers la piste");
            etatAvion=new EnPiste();
        }

        @Override
        public void doAction() {
            System.out.println("Action relatif au Vol...");
        }
    }


}
