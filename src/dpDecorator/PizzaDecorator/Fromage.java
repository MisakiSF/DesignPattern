package dpDecorator.PizzaDecorator;

import dpDecorator.TypePizza.Pizza;

public class Fromage extends DecoratorPizza {

    public Fromage(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cout() {
        return 13+pizza.cout();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with "+" Fromage";
    }
}
