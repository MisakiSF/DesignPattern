package dpAdapter.Implementation;


public class ImplStandard1 implements Standard {
    @Override
    public void operation(int nb1, int nb2) {
        System.out.println("Standard : Resultat :"+nb1*nb2);
    }
}
