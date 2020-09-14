/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAOImplements.Eleve;
import java.util.ArrayList;

/**
 *
 * @author TPC
 */
public abstract interface DAOEleves {
     int nombre();
     ArrayList<Eleve> getListe();
     void ajouterEleve(Eleve eleve);
     Eleve chercher(String nom);
     void lister();
}
