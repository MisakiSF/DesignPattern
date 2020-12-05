package dpStrategy;

public class PaimentParCarte implements IPaiment {
    private static double  reduction=0.1;
    @Override
    public double payer(double prix, int quantite) {
        System.out.println("par carte");
        return (prix*quantite)-(prix*quantite*reduction);
    }
}
