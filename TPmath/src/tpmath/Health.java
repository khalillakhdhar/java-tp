/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmath;

import javax.swing.JOptionPane;

/**
 *
 * @author pro
 */
public class Health {
   
 private  int max,min;
 private double poid,taille,glycemie;
 private  String nom,prenom;

 

    public Health(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Health() {
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public Health(double glycemie, int max, int min, double poid, double taille, String nom, String prenom) {
        this.glycemie = glycemie;
        this.max = max;
        this.min = min;
        this.poid = poid;
        this.taille = taille;
        this.nom = nom;
        this.prenom = prenom;
    }

   

    public double getGlycemie() {
        return glycemie;
    }

    public void setGlycemie(double glycemie) {
        this.glycemie = glycemie;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
   
   public int imc()
   {
  
   return (int) Math.round(poid/(Math.pow(taille,2)));
   
   }
  public String remarque()
   {
   if(imc()<20)
   {
   return "Maigre!";
   }
   else if(imc()<=25)
   {
     return "idéale";

   }
   else
   {
     return "Surpoid!";

   }
   }
  public String gly()
  {
  if(this.glycemie<0.7)
  {
       return "hypoglycémie!";

  
  }
  else if(this.glycemie<=1)
  {
       return " glycémie Idéal!";

  
  }
  else
  {
       return "Hyperglycémie!";

  }
  
  
  }
public String tension()
{
if((min<7)&&(max<12))
{
return  "hypotension";
}
else if((min>8)&&(max>12))
{
     return "hypertension!";

}
else
{
     return "Pression idéale!";

}

}
    
}
