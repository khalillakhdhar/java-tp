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
public class Calculerimplement implements Calculer{

    @Override
    public int max(int a, int b) {

if(a>b)
    return a;
else return b;
/*
for(int i=0;i<n;i++)
{
SOP(i}


*/
    }

    @Override
    public double factoriel(int a) {

double f=1;
for(int i=2;i<=a;i++)
{
f=f*i;
}
return f;

    }

    @Override
    public int pgcd(int a, int b) {

while(a!=b)
{
if(a>b)
{
a=a-b;
}
else
    b=b-a;
}
return a;
    }
    

    

    @Override
    public String premier(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
