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

        Calculator c=new Calculator();
        System.out.println("Rezultatul este adunarii: " + c.add(3,5));
        System.out.println("Rezultatul este adunarii: " + c.add(3.1,5.1));

        System.out.println("Rezultatul este scaderii: " + c.dif(3,5));
        System.out.println("Rezultatul este scaderii: " + c.dif(3.1,5.1));

        System.out.println("Rezultatul este inmultirii: " + c.mult(3,5));
        System.out.println("Rezultatul este inmultirii: " + c.mult(3.1,5.1));

        System.out.println("Rezultatul este impartirii: " + c.div(7,5));
        System.out.println("Rezultatul este impartirii: " + c.div(7.5,3.1));

    }
}
