package model;

public class Employe extends Personne {
    protected  String salaire;
    protected  String zone;

    public Employe(String salaire, String zone) {
        this.salaire = salaire;
        this.zone = zone;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "salaire='" + salaire + '\'' +
                ", zone='" + zone + '\'' +
                ", nom='" + nom + '\'' +
                ", personne='" + prenom + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
