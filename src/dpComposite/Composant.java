package dpComposite;

public abstract class Composant {
    protected String nom;
    protected int niveau;
    public abstract void operation();

    public Composant(String nom) {
        this.nom = nom;
    }
}
