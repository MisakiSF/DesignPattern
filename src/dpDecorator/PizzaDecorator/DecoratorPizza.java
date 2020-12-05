package dpDecorator.PizzaDecorator;

import dpDecorator.TypePizza.Pizza;

public abstract class DecoratorPizza extends Pizza {
    // agregation
    protected Pizza pizza;

    public DecoratorPizza(Pizza pizza) {
        super();
        this.pizza = pizza;
    }
public abstract String getDescription();
}
