/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematiques;

/**
 *
 * @author pro
 */
public class Mathematiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculerimplement cl=new Calculerimplement();
        double x=cl.factoriel(8);
       int y= cl.pgcd(5, 15);
       System.out.println(x);
       System.out.println(y);


    }
    
}
