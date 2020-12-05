package dpComposite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant {
    private List<Composant> composants=new ArrayList<>();

    public Composite(String nom) {
        super(nom);
    }
    @Override
    public void operation() {
        String tab="";
        for (int i=0;i<niveau;i++){
            tab+="+++++++++";
        }
        System.out.println(tab+" Composite "+nom);
        for (Composant c:composants){
            c.operation();
        }
    }
    public void addComposite(Composant C){
        //faut definir le nv
        C.niveau=this.niveau+1;
        composants.add(C);
    }
    public void removeComposite(Composant C){
        //C.niveau=this.niveau-1;
        composants.remove(C);
    }
    public List<Composant> getChilds(){
        return composants;
    }

}
