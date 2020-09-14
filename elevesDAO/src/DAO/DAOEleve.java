/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author TPC
 */
public abstract interface DAOEleve {
  void ajouterNote(int note);
  double getMoyenne();
 String getNom();
  ArrayList<Integer> getListeNotes();
  @Override
  String toString();
  
}
