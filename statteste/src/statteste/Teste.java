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
public class Teste {
    static int a=4;
    int b;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Teste.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    void increment()
    {
    a=a+2;
    }
        void increment2()
    {
    b=b+2;
    }
    
    
}
