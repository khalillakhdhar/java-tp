/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleves;

/**
 *
 * @author pro
 */
import java.util.ArrayList;

public class Eleve {
    private String nom;
    private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
    private double moyenne;
        private static Eleve single_instance = null; 

    public Eleve(String nom) {
	this.nom = nom;
    }

    private Eleve(String nom, double moyenne) {
        this.nom = nom;
        this.moyenne = moyenne;
    }
       public static Eleve getInstance(String nom, double moyenne) 
    { 
        if (single_instance == null) 
            single_instance = new Eleve( nom,  moyenne); 
  
        return single_instance; 
    } 
    public double getMoyenne() {
	return moyenne;
    }
    
    public String getNom() {
	return nom;
    }

    public ArrayList<Integer> getListeNotes() {
	return listeNotes;
    }
    
    /* Une note inferieure a 0 sera considere comme egale a 0 ;
       une note superieure a 20 sera considere comme egale a 20 */
    public void ajouterNote(int note) {
	int nbNotes = this.listeNotes.size();
	if (note < 0) note = 0;
	else if (note > 20) note = 20;
	this.moyenne = (this.moyenne * nbNotes + note) / (nbNotes + 1);
	listeNotes.add(note);
    }
    
    public String toString() {
	return nom + " (" + (int)(100 * moyenne)/100.0 + ")";
    }
    public static void main(String[] arg) {
            
 Eleve x = Eleve.getInstance("pierre",12); 
  
        // instantiating Eleve class with variable y 
        Eleve y = Eleve.getInstance("Alain",20); 
  
        // instantiating Eleve class with variable z 
        Eleve z = Eleve.getInstance("Adan",15); 
        System.out.println(x.nom);
	}
}
