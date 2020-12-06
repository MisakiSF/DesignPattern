package TD1.exercice2.implementation;

public class Framework {
private  ITraitement traitement;
private static  Framework framework;
    private Framework() {
       traitement=new ImplTraitement1();
    }

    //Get the only object available
    public static Framework getInstance(){
        if (framework==null)
            framework=new Framework();
            return framework;
    }

    public void setTraitement(ITraitement traitement) {
        this.traitement = traitement;
    }

    public ITraitement getTraitement() {
        return traitement;
    }
}
