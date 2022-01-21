/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.User;
import connexion.Connexion;
import dao.IDao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ultrapc
 */
public class UserService implements IDao<User>{

    @Override
    public boolean create(User o) {
        String sql = "insert into user values (null, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getNom());
            ps.setString(2, o.getPrenom());
            ps.setString(3, o.getTelephone());
            ps.setString(4, o.getEmail());
            ps.setDate(5, new Date(o.getDateNaissance().getTime()));
         
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("create : erreur sql : " + e.getMessage());
        }
        return false;
    }

    
  



    @Override
    public User findById(int id) {
        String sql = "select * from user where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email"), rs.getDate("dateNaissance"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return null;

    }
    
    

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<User>();

        String sql = "select * from user";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                users.add(new User(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email"), rs.getDate("dateNaissance")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return users;
    }
    
    
      public User findBynom(String nom) {
        String sql = "select * from user where nom = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, nom);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email"), rs.getDate("dateNaissance"));
            }
        } catch (SQLException e) {
            System.out.println("findBynom " + e.getMessage());
        }
        return null;
    }
    
   
    
}
