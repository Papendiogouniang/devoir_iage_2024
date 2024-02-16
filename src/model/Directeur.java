package model;

public class Directeur  extends Personne{
    protected  String matricule;


    public Directeur(String matricule) {
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Directeur{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
