package fr.cfarge067;

/**
 * Created by clemzux on 05/04/16.
 */
public class CChien {

    //////// attributs ////////

    private String nom;
    private int poids;


    //////// builders ////////

    public CChien (String pNom, int pPoids){

        nom = pNom;
        poids = pPoids;
    }

    public CChien (){

        nom = null;
        poids = 0;
    }


    //////// getters / setters ////////


    public String getNom() { return nom; }

    public int getPoids() { return poids; }

    public void setNom(String nom) { this.nom = nom; }

    public void setPoids(int poids) { this.poids = poids; }

    @Override
    public String toString() {
        return "CChien{" +
                "nom='" + nom + '\'' +
                ", poids=" + poids +
                '}';
    }


    //////// methods ////////

    
}
