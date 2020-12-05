package dpDecorator.PizzaDecorator;

import dpDecorator.TypePizza.Pizza;

public class Champinion extends DecoratorPizza {
    public Champinion(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with "+" Champinion";
    }

    @Override
    public double cout() {
        return 10+pizza.cout();
    }
}
