package Fonctionnalité;

import Repository.ImplPersonneMysql;
import jdk.internal.jrtfs.JrtFileSystemProvider;
import model.Personne;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Fonctionnalite {
    Scanner clavier = new Scanner(System.in);

    private ImplPersonneMysql  implPersonneMysqlMysql;
    public Fonctionnalite(){
        ImplPersonneMysql implPersonneMysql = new ImplPersonneMysql();
    }
    public int menu(){
        int choix;

        System.out.println("1-Nom");
        System.out.println("2-Prenom");
        System.out.println("3-Adress");
        System.out.println("4-Zone");
        System.out.println("5-Quitter");
        do{
            choix = clavier.nextInt();
            if(choix<1 || choix >5){
                System.out.println("Le choix est incorrect .");
            }
        }while(choix<1 || choix >5);
        return  choix;
    }

    public int menuTypePerosnne(){
        int choix;

        System.out.println("1-Matricule");

        do{
            choix = clavier.nextInt();
            if(choix<0 || choix >1){
                System.out.println("Le choix est incorrect .");
            }
        }while(choix<0 || choix >1);
        return  choix;
    }

    public void ajoutPersonne() throws SQLException {
        int type = menuTypePersone();
        Personne personne = (type == 1) ?  new Personne();

        clavier.nextLine();
        System.out.println("Saisir nom");
        personne.setNom(clavier.nextLine());
        System.out.println("Saisir prenom");
        personne.setPrenom(clavier.nextLine());
        clavier.nextLine();
        System.out.println("Saisir adress");
        personne.setAdress(clavier.nextLine());
        clavier.nextLine();
        System.out.println("Saisir salaire");
        personne.setsalaire(clavier.nextLine());
        clavier.nextLine();
        System.out.println("Saisir zone");
        personne.setzone(clavier.nextLine());
        clavier.nextLine();

        if( type == 1 ){
            System.out.println("Saisir Matricule");
            Object matricule = new Object();
            ((Matricule)matricule).setMatricule(clavier.nextInt());
        }
        Object Personne;
        implPersonneMysqlMysql.addPersonne(personne);
    }

    private int menuTypePersone() {
        return 0;
    }

    public void getAllPersonne() throws SQLException {
        List<Personne> personnes =  implPersonneMysqlMysql.getAllEmploye();
        for (Personne p: personnes) {
            System.out.println(p.toString());
        }
    }


    

    public void deleteBYmatricule() {
        String numero;
        clavier.nextLine();
        System.out.println("Saisir matricule");
        numero = clavier.nextLine();
        Object matricule = new Object();
        List<Personne> personnes =  implPersonneMysqlMysql.Matricule(matricule);
        for (Personne p: personnes) {
            System.out.println(p.toString());
        }
    }
}
