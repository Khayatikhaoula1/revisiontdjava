public class Voiture extends Vehicule{

    private String couleur;

public Voiture(){
    super();}

    public Voiture(int id,String marq, String ty, String couleur){
    super(id,marq,ty);
    this.couleur=couleur;
    }

    public String getCouleur() {return couleur;}

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public String toString(){
    return "Voiture :"+super.toString()+" Couleur :"+couleur;
    }
}
