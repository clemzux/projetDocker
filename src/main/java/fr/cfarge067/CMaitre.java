package fr.cfarge067;

/**
 * Created by clemzux on 05/04/16.
 */
public class CMaitre {

    //////// attributs ////////

    String nom;
    int age;


    //////// builders ////////

    public CMaitre (String pNom, int pAge){

        nom = pNom;
        age = pAge;
    }

    public CMaitre (){

        nom = null;
        age = 0;
    }


    //////// getters / setters ////////


    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "CMaitre{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
