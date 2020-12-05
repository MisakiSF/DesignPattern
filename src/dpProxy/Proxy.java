package dpProxy;
import java.util.Random;
public class Proxy implements Standard {
    private StandardImp1 target = new StandardImp1();

    @Override
    public void process() {
        System.out.println("verification du contexte de securite");
        boolean b=new Random().nextBoolean();
        if(b){
            System.out.println("Avant l'appel");
            target=new StandardImp1();
            target.process();
            System.out.println("Apres l'appel");
        }
        else{
            throw  new RuntimeException("Forbiden 403");
        }

    }
}
