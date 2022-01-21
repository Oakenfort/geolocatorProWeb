/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Smartphone;
import bean.User;
import connexion.Connexion;
import dao.IDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ultrapc
 */
public class SmartphoneService implements IDao<Smartphone>{
    
    UserService userService = new UserService();

    @Override
    public boolean create(Smartphone o) {
        String sql = "insert into smartphone values (null, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getImei());
            ps.setInt(2, o.getUser());
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("create : erreur sql : " + e.getMessage());
        }
        return false;
    }
    
    /*
    
    private int id;
    private String imei;
    private List<Position> positions;
    private User user;
    */

   

    @Override
    public Smartphone findById(int id) {
      
    	String sql = "select * from smartphone where id  = ?";
    	  Smartphone s = null;
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Smartphone(rs.getInt("id"), rs.getString("imei"), rs.getInt("user"));
            }

        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return s;
    }
   


    @Override
    public List<Smartphone> findAll() {
        List<Smartphone> smartphone = new ArrayList<Smartphone>();

        String sql = "select * from smartphone";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                smartphone.add(new Smartphone(rs.getInt("id"), rs.getString("imei"), rs.getInt("user")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return smartphone;
    }
    
    
 
    public List<Smartphone> utilisateurs(String nom) {
        List<Smartphone> smartphone = new ArrayList<Smartphone>();

        String sql = "select * from smartphone where user = ?";
         User s = userService.findBynom(nom);
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
             ps.setInt(1, s.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                smartphone.add(new Smartphone(rs.getInt("id"), rs.getString("imei"), rs.getInt("user")));
            }

        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return smartphone;
    }
    
    
      public Smartphone findByimei(String imei) {
        String sql = "select * from smartphone where imei = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, imei);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Smartphone(rs.getInt("id"), rs.getString("imei"), rs.getInt("user"));
            }
        } catch (SQLException e) {
            System.out.println("findByimei " + e.getMessage());
        }
        return null;
    }
}
