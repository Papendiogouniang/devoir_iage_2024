package model;

import java.sql.SQLException;
import java.util.List;

public interface IPersonne<P> {


    List<Personne> getAllEmploye()throws SQLException;
    List<Personne> getAllDirecteur()throws SQLException;
    void  addPersonne(P p) throws SQLException;
    void updatePersonne(int id,P p) throws SQLException;

    void deleteByMatricule(int id) throws SQLException;


    List<Personne> Matricule(Object matricule);
}
