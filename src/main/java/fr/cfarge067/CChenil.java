package fr.cfarge067;

/**
 * Created by clemzux on 05/04/16.
 */
public class CChenil {

    //////// attributs ////////

    String nom;
    int capacite;


    //////// builders ////////

    public CChenil (String pNom, int pCapacite){

        nom = pNom;
        capacite = pCapacite;
    }

    public CChenil (){

        nom = null;
        capacite = 0;
    }


    //////// getters / setters ////////


    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public int getCapacite() { return capacite; }

    public void setCapacite(int capacite) { this.capacite = capacite; }

    @Override
    public String toString() {
        return "CChenil{" +
                "nom='" + nom + '\'' +
                ", capacite=" + capacite +
                '}';
    }
}
