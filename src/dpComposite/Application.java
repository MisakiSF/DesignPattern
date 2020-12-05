package dpComposite;

public class Application {
    public static void main(String[] args) {
     Composite racine=new Composite("composite1");
     Composite composite2=new Composite("composite2");

     racine.addComposite(composite2);
        racine.addComposite(new Element("Fichier1.1"));
        racine.addComposite(new Element("Fichier1.2"));
        racine.addComposite(new Element("Fichier1.3"));
     composite2.addComposite(new Element("Fichier2.1"));
     composite2.addComposite(new Element("Fichier2.2"));

     racine.operation();
    }
}
