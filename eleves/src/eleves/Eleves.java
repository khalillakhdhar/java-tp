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
public class Eleves {

    /**
     * @param args the command line arguments
     */
	public static void main(String[] arg) {
            
		Eleve eleve = new Eleve(arg[0]);
		for (int i = 1; i < arg.length; i++) {		
			eleve.ajouterNote(Integer.parseInt(arg[i]));
			System.out.println("Moyenne de " + eleve.getNom() +
					" : " + eleve.getMoyenne());
		}
		System.out.println(eleve);
	}
}
