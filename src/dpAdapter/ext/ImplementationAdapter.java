package dpAdapter.ext;

public class ImplementationAdapter {
    public int operation2(int nb1,int nb2){
        return nb1*nb2;
    }
    public void operation3(int nb){
        System.out.println("Ancienne Implementation : resultat="+nb);
    }
}
