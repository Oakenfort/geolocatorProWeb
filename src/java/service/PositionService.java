/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Position;
import bean.Smartphone;
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
public class PositionService implements IDao<Position> {

    SmartphoneService smartphoneService = new SmartphoneService();
    UserService userService= new UserService();
    

    @Override
    public boolean create(Position o) {
        String sql = "insert into position values (null, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setString(1, o.getLatitude());
            ps.setString(2, o.getLongitude());
            ps.setDate(3, new Date(o.getDate().getTime()));
            ps.setInt(4, o.getSmartphone());

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
     private String latitude;
     private String longitude;
     private Date date;
     private Smartphone smartphone;
     */
    @Override
    public Position findById(int id) {
        Position p = null;
        String sql = "select * from position where id  = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Position(rs.getInt("id"), rs.getString("latitude"), rs.getString("longitude"), rs.getDate("date"), rs.getInt("smartphone"));
            }
        } catch (SQLException e) {
            System.out.println("findById " + e.getMessage());
        }
        return p;
    }

    @Override
    public List<Position> findAll() {
        List<Position> positions = new ArrayList<Position>();

        String sql = "select * from position";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);;
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                positions.add(new Position(rs.getInt("id"), rs.getString("latitude"), rs.getString("longitude"), rs.getDate("date"), rs.getInt("smartphone")));
            }
        } catch (SQLException e) {
            System.out.println("findAll " + e.getMessage());
        }
        return positions;
    }

    public int nbrPositionParSmart(String imei) {
        String sql = "select count(*) as total from position where smartphone = ?";
        // Specialite s = specialiteService.findByLibelle(imei);
        Smartphone s = smartphoneService.findByimei(imei);
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, s.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

   public Position findByDate(Date d) {
        String sql = "select * from position where date = ?";
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setDate(1, d);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Position(rs.getInt("id"), rs.getString("latitude"), rs.getString("longitude"), rs.getDate("date"), rs.getInt("smartphone"));
            }
        } catch (SQLException e) {
            System.out.println("findBydate " + e.getMessage());
        }
        return null;
    }

    public int nbrPositionParSmartParMois(String imei, Date d) {
        String sql = "select count(*) as total , date  from position where smartphone = ? and date = ?";
        // Specialite s = specialiteService.findByLibelle(imei);
        Smartphone s = smartphoneService.findByimei(imei);
        //Position p = positionService.findByDate(d);
        try {
            PreparedStatement ps = Connexion.getInstane().getConnection().prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setDate(2, d);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
      
       
       
       /* public List<Position> firstBetween(String nom,Date dd1, Date dd2) {
        List<Position> positions = new ArrayList<Position>();
        String sql = "select * from position where user = ? and date between '" + new java.sql.Date(dd1.getTime()) + "' and '" + new java.sql.Date(dd2.getTime()) + "' ";
        PreparedStatement ps = null;
        ResultSet rs = null;
        User s=userService.findBynom(nom);

        try {
            ps = Connexion.getInstane().getConnection().prepareStatement(sql);
             ps.setInt(1, s.getId());
            rs = ps.executeQuery(sql);
            while (rs.next()) {
                positions.add(new Position(rs.getInt("id"), rs.getString("latitude"), rs.getString("longitude"), rs.getDate("date"), rs.getInt("smartphone")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return positions;

    }*/
    
    
    

}
