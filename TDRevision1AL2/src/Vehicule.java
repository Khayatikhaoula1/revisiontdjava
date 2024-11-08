public class Vehicule {


    protected int identifiant;
    protected String marque, typeC;


    public Vehicule(int id, String n, String typeC) {
        this.identifiant = id;
        this.marque = n;
        this.typeC = typeC;
    }

    public Vehicule() {
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeC() {
        return typeC;
    }

    public void setTypeC(String typeC) {
        this.typeC = typeC;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "identifiant=" + identifiant +
                ", marque='" + marque + '\'' +
                ", typeC='" + typeC + '\'' +
                '}';
    }

    public boolean equals(Object ob) {
        if (ob == this) return true;
        if (ob == null) return false;
        if (ob.getClass() != this.getClass()) return  false;
        Vehicule v = (Vehicule) ob;

        if (v.identifiant == this.identifiant && v.marque.equalsIgnoreCase(marque))
            return true;
        return false;
    }
}
