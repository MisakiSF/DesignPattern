package dpDecorator.TypePizza;

public class Dinde extends Pizza {
    public Dinde() {
        description ="Pizza au Dinde";
    }

    @Override
    public double cout() {
        return 25;
    }
}
