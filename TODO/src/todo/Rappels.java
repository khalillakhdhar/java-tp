/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo;

import java.util.ArrayList;

/**
 *
 * @author pro
 */
public class Rappels {
   private ArrayList<Rappel> rappellist=new ArrayList<Rappel>();

    public Rappels() {
    }
    void addrappel(Rappel rappel)
    {
    rappellist.add(rappel);
    
    }
    
    public ArrayList<Rappel> getRappellist() {
        return rappellist;
    }

    public void setRappellist(ArrayList<Rappel> rappellist) {
        this.rappellist = rappellist;
    }
    
    void lister()
    {
    System.out.println("Liste des rappels ");
    for(Rappel r : rappellist)
    {
        System.out.println(r.toString());
    
    }
    
    }
    
    
}
