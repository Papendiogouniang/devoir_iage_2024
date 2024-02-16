import Fonctionnalité.Fonctionnalite;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


            int choix;

            Fonctionnalite fonctionnalite = new Fonctionnalite();

            do{
                choix = fonctionnalite.menu();

                switch (choix){

                    case  1:
                        fonctionnalite.ajoutPersonne();
                        break;
                    case  2:
                        fonctionnalite.getAllPersonne();
                        break;

                    case  3:
                        fonctionnalite.deleteBYmatricule();
                        break;
                    case  4:
                        fonctionnalite.menuTypePerosnne();
                        break;
                    case  5:
                        break;
                    default:
                        System.out.println("Ciao Ciao !!!");

                }
            }while(choix != 6);




        }
    }
