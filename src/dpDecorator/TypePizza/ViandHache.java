package dpDecorator.TypePizza;

import dpDecorator.TypePizza.Pizza;

public class ViandHache extends Pizza {
    public ViandHache() {
        description="Pizza au Viande hache";
    }

    @Override
    public double cout() {
        return 20;
    }
}
