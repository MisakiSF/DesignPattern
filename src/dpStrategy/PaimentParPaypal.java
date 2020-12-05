package dpStrategy;

public class PaimentParPaypal implements IPaiment {
    private static double  reduction=0.2;
    @Override
    public double payer(double prix, int quantite) {
        System.out.println("par paypal");
        return (prix*quantite)-(prix*quantite*reduction);
    }
}
