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
import java.util.Scanner;

public class TestGroupeElevesFichier {
	public static void main(String[] arg) throws IOException {
		GroupeEleves groupe = new GroupeEleves();
		Eleve eleve;
            try (Scanner lecteur = new Scanner(new File("./liste.txt"))) {
                while (lecteur.hasNext()) {
                    eleve = new Eleve(lecteur.next());
                    while (lecteur.hasNextInt()) eleve.ajouterNote(lecteur.nextInt());
                    groupe.ajouterEleve(eleve);
                }
            }
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