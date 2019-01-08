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
        System.out.println("Rezultatul este: " + c.add(3,5));

        System.out.println("Rezultatul este: " + c.dif(3,5));

        System.out.println("Rezultatul este: " + c.mult(3,5));

        System.out.println("Rezultatul este: " + c.div(7,3));

    }
}
