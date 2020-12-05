package dpStrategy;

public class PaimentParCheque implements IPaiment {
    private static double  reduction=0.3;
    @Override
    public double payer(double prix, int quantite) {
        System.out.println("par cheque");
        return (prix*quantite)-(prix*quantite*reduction);
    }
}
