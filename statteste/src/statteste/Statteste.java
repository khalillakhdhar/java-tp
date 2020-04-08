/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statteste;

/**
 *
 * @author pro
 */
public class Statteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Teste t=new Teste();
        t.setB(4);
        Teste t2=new Teste();
      t.increment();
      System.out.println("la valeur de a est: "+Teste.getA());

t.increment2();
System.out.println("la valeur de b est: "+t.getB());

t2.increment();
System.out.println("la valeur de a est: "+Teste.getA());

t2.increment2();
System.out.println("la valeur de b est: "+t2.getB());



    }
    
}
