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
import java.io.File;
import java.io.IOException;


public class TestGroupeEleves {
	public static void main(String[] arg) {
		Eleve eleve;
		GroupeEleves groupe = new GroupeEleves();

		eleve = new Eleve("Rawia");
		eleve.ajouterNote(12);
		eleve.ajouterNote(17);
		groupe.ajouterEleve(eleve);
		eleve = new Eleve("Ahmed");
		eleve.ajouterNote(15);
		eleve.ajouterNote(9);
		groupe.ajouterEleve(eleve);
		eleve = new Eleve("Ali");
		eleve.ajouterNote(16);
		groupe.ajouterEleve(eleve);
		groupe.lister();
		eleve = groupe.chercher("Khalil");
		if (eleve != null) 
			System.out.println("Voila Khalil :  " + groupe.chercher("Khalil"));
		else System.out.println("Khalil n'est pas dans la liste");
		eleve = groupe.chercher("Rawia");
		if (eleve != null) 
			System.out.println("Voila Rawia : " +  groupe.chercher("Rawia"));
		else System.out.println("Rawia n'est pas dans la liste");
	}
}