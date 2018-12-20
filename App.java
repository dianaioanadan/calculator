package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Sum c;
        c = new Sum();
        System.out.println("Rezultatul este: " + c.add(3,5));

        Sub d;
        d = new Sub();
        System.out.println("Rezultatul este: " + d.dif(3,5));

        Multiplication e;
        e = new Multiplication();
        System.out.println("Rezultatul este: " + e.mult(3,5));

        Division f;
        f = new Division();
        System.out.println("Rezultatul este: " + f.div(7,3));

    }
}
