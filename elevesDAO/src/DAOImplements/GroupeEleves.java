/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImplements;

/**
 *
 * @author pro
 */
import DAO.DAOEleves;
import java.util.ArrayList;

public class GroupeEleves implements DAOEleves {

	private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();

	public GroupeEleves() {
	}

	public int nombre() {
		return listeEleves.size();
	}

	public ArrayList<Eleve> getListe() {
		return listeEleves;
	}

	public void ajouterEleve(Eleve eleve) {
		listeEleves.add(eleve);
	}

	public Eleve chercher(String nom) {
		for (Eleve eleve : listeEleves) 
			if (eleve.getNom().equals(nom)) return eleve;
		return null;
	}

	public void lister() {
		System.out.println("Liste des eleves : ");
		for (Eleve eleve : listeEleves) {
			System.out.println(eleve);
		}
	}
}