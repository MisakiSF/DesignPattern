package dpAdapter.app;


import dpAdapter.Implementation.AdapterHeritage;
import dpAdapter.Implementation.ImplStandard1;
import dpAdapter.Implementation.Standard;
import dpAdapter.ext.AdapterComposition;

public class Application {
    public static void main(String[] args) {
        //a moi de crer l'implementation et de programmer l'algorithme
        System.out.println("++++ par implementation standard++++");
        Standard standard1=new ImplStandard1();
        standard1.operation(7,9);

        System.out.println("++++ par Heritage++++");
        Standard standard2=new AdapterHeritage();
        standard2.operation(7,9);

        System.out.println("++++ par composite++++");
        Standard standard3=new AdapterComposition();
        standard3.operation(7,9);

    }
}
