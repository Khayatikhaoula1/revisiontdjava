public class Station {

    private int id;
    private String nom;

    private final int CAP = 10;

    private Vehicule[] tabV = new Vehicule[CAP];
    private int comp;

    public Station() {
    }

    public Station(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void ajouterVehicule(Vehicule v) throws AjoutVehiculeException {
        if (comp < CAP) {
            if (rechercherVehicule(v) == false) {
                tabV[comp] = v;
                comp++;
            } else {
                throw new AjoutVehiculeException("Vehicule existe");
            }
        } else {
            System.out.println("Station plein");
        }

    }

    public boolean rechercherVehicule(Vehicule v) {
        for (int i = 0; i < comp; i++) {
            if (tabV[i].equals(v))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "L'ensemble des vehicules";

        for (int i = 0; i < comp; i++) {
            str+=tabV[i].toString();
        }
        return "id "+id+ " nom :"+nom+str;
    }

    public int NbrVoitureEssence()
    {
        int nb=0;
        for (int i = 0; i < comp; i++) {
            if (tabV[i] instanceof Voiture && tabV[i].getTypeC().equalsIgnoreCase("essence")) {
                nb++;
            }
        }

      return nb;
    }

    public int NbrVoitureNoire()
    {
        int nb=0;
        for (int i = 0; i < comp; i++) {

            if    (tabV[i] instanceof Voiture) {
              Voiture v=(Voiture) tabV[i];
              if(((Voiture)tabV[i]).getCouleur().equalsIgnoreCase("noir"))
                  nb++;
            }

        }
        return nb;
    }
}
