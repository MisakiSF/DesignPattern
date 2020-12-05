package dpStrategy;

public class Context {
    private IPaiment iPaiment;

    public void setiPaiment(IPaiment iPaiment) {
        this.iPaiment = iPaiment;
    }

    public double appliquerStrategy() {
        return iPaiment.payer(22,2);
    }


}
