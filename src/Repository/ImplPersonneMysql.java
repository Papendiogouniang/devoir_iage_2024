package Repository;

import Fonctionnalité.Matricule;
import model.IPersonne;
import model.Personne;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImplPersonneMysql implements IPersonne  <Personne> {


    @Override
    public List<Personne> getAllEmploye() throws SQLException {
        String sql = "SELECT * FROM employe where id= ?";
        Connection connection = null;
        PreparedStatement statement = connection.prepareStatement(sql);
        int id = 0;
        statement.setInt(1,id);
        ResultSet result=  statement.executeQuery();
        if(result.next()){
            return (List<Personne>) new Matricule();
        }

        throw new SQLException("Id n'existe pas ");
    }

    @Override
    public List<Personne> getAllDirecteur() throws SQLException {
        return null;
    }

    @Override
    public void addPersonne(Personne personne) throws SQLException {

            Object Personne;
            Boolean result= Personne instanceof Matricule;
            String choix = (result) ? "matricule" ;
            String sql = "INSERT INTO persone (nom,prenom,adresse,"+choix+") values (?,?,?,?)";
            Connection connection;
            PreparedStatement statement;
        statement = connection.prepareStatement(sql);
        statement.setDouble(1,personne.getNom());
            statement.setDouble(2,personne.getPrenom());
            statement.setDouble(3,personne.getAdress());

            if ((result)) {
                Object Matricule = new Object();
                statement.setInt(4, ((Matricule) ).Matricule());


                statement.executeUpdate();


            }



    @Override
    public void updatePersonne(int id, Personne personne) throws SQLException {

            Object Personne = new Object();
            Boolean result= Personne instanceof Matricule;
            String choix = (result) ? "matricule" ;
                String sql = "Update INTO persone (nom,prenom,adresse,"+choix+") values (?,?,?,?)";
            Connection connection;
            PreparedStatement statement;
            statement = connection.prepareStatement(sql);
            statement.setDouble(1,personne.getNom());
            statement.setDouble(2,personne.getPrenom());
            statement.setDouble(3,personne.getAdress());

            if ((result)) {
                Object Matricule = new Object();
                statement.setInt(4, ((Matricule) ).Matricule());


                statement.executeUpdate();

            }

    @Override
    public void deleteByMatricule(int id) throws SQLException {*
            @Override
            public void delete(int id) throws SQLException {
                String sql = "Delete from personne where id = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1,id);
                statement.executeUpdate();

            }

        }
}

    public void Matricule() {
    }