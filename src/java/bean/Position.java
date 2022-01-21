/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;

/**
 *
 * @author Ultrapc
 */
public class Position {

    private int id;
    private String latitude;
    private String longitude;
    private Date date;
    private int smartphone;

    public Position(int id, String latitude, String longitude, Date date, int smartphone) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.smartphone = smartphone;
    }

    public Position(String latitude, String longitude, Date date, int smartphone) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
        this.smartphone = smartphone;
    }
    
       public Position(String latitude, String longitude, Date date) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.date = date;
   
    }


    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSmartphone() {
        return smartphone;
    }

    public void setSmartphone(int smartphone) {
        this.smartphone = smartphone;
    }

  

    @Override
    public String toString() {
        return "Position{" + "id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", date=" + date + ", smartphone=" + smartphone + '}';
    }

}
