package model;

public class Personne {
    protected  int id;
    protected  String nom;
    protected  String prenom;
    protected  String adress;


    public Personne(){

    }

    public Personne(int id, String nom, String prenom, String adress) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
    }

   

    public int getId() {
        return id;
    }

    public double getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrenom() {
        return prenom;
    }

    public void setPrenom(String personne) {
        this.prenom = personne;
    }

    public double getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public void setsalaire(String nextLine) {
    }

    public void setzone(String nextLine) {
    }
}
