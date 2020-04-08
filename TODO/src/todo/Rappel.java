/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

/**
 *
 * @author pro
 */
public class Rappel {
 private  String titre,occasion,description,date;
private int id;
    public Rappel(String titre, String occasion, String description, String date) {
        this.titre = titre;
        this.occasion = occasion;
        this.description = description;
        this.date = date;
    }

    public Rappel(String titre, String occasion, String description, String date, int id) {
        this.titre = titre;
        this.occasion = occasion;
        this.description = description;
        this.date = date;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Rappel{" + "titre=" + titre + ", occasion=" + occasion + ", description=" + description + ", date=" + date + '}';
    }
   
}
