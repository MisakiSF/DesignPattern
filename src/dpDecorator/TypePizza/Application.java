package dpDecorator.TypePizza;

import dpDecorator.PizzaDecorator.Champinion;
import dpDecorator.PizzaDecorator.Fromage;

public class Application {
    public static void main(String[] args) {
        Pizza pizza;
        pizza =new ViandHache();
        System.out.println("++++++++++++++++++");
        pizza=new Champinion(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.cout());

        System.out.println("++++++++++++++++++");
        pizza =new Dinde();
        pizza=new Fromage(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.cout());
        System.out.println("++++++++++++++++++");

//new new new new  --> attern decorateur
        Pizza pizza1=new Fromage(new Dinde());
        System.out.println(pizza.getDescription());
        System.out.println(pizza.cout());


    }
}
