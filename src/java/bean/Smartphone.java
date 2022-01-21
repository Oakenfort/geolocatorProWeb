/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author Ultrapc
 */
public class Smartphone {

    private int id;
    private String imei;
    private List<Position> positions;
    private int user;

    public Smartphone(int id, String imei, int user) {
        this.id = id;
        this.imei = imei;
        this.user = user;
    }

    public Smartphone(String imei, int user) {
        this.imei = imei;
        this.user = user;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    
    @Override
    public String toString() {
        return "Smartphone{" + "id=" + id + ", imei=" + imei + ", positions=" + positions + ", user=" + user + '}';
    }
    
    

}
