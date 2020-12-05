package dpStrategy;

public class App {

    public static void main(String[] args) {
        Context ctx=new Context();

        ctx.setiPaiment(new PaimentParCarte());
        PaimentParCarte paimentParCarte=new PaimentParCarte();
        System.out.println(paimentParCarte.payer(22,2));


        ctx.setiPaiment(new PaimentParCheque());
        PaimentParCheque paimentParCheque=new PaimentParCheque();
        System.out.println(paimentParCheque.payer(22,2));


        ctx.setiPaiment(new PaimentParPaypal());
        PaimentParPaypal paimentParPaypal=new PaimentParPaypal();
        System.out.println(paimentParPaypal.payer(22,2));



    }

}
