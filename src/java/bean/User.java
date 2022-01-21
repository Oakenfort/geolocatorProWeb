/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ultrapc
 */
public class User {

    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private Date dateNaissance;
    private List<Smartphone> smartphones;

    public User() {
        super();
    }

    public User(int id, String nom, String prenom, String telephone, String email, Date dateNaissance) {
        super();
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.dateNaissance = dateNaissance;
    }

    public User(String nom, String prenom, String telephone, String email, Date dateNaissance,
            List<Smartphone> smartphones) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.smartphones = smartphones;

    }

    public User(String nom, String prenom, String telephone, String email, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.dateNaissance = dateNaissance;

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public List<Smartphone> getSmartphones() {
        return smartphones;
    }

    public void setSmartphones(List<Smartphone> smartphones) {
        this.smartphones = smartphones;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email=" + email + ", dateNaissance=" + dateNaissance + ", smartphones=" + smartphones + '}';
    }
    

}
