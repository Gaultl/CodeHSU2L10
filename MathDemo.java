//import static java.lang.Math.*;

public class MathDemo{
    public static void main(String[] args){
        
        double x1 = 17.2;
        double y1 = -8.5;
        double x2 = 5.6;
        double y2 = -2.0;
        int z = 7;
        
        //absolute value
        System.out.println(Math.abs(y1));
        //System.out.println(abs(y1)); only use if import is used
        
        //square root something
        double squareRoot = Math.sqrt(z);
        System.out.println(squareRoot);
        
        //use exponents
        double powerEx = Math.pow(7,5);
        System.out.println("7 to the 5th power is " + (int) powerEx);
        
        //find the sin, cos, and tan of an angle
        int angle1 = 60; //in degrees
        double ang1Rad = Math.toRadians(angle1);
        System.out.println("The cos of 60 degrees is " + Math.cos(ang1Rad));
        System.out.println("the true value is 0.5");
        
        //convert to radians by multiplying by pi/180
        final double PI = Math.PI;
        double ang1Rad2 = angle1*(PI/180);
        System.out.println("The cos of 60 degrees is " + Math.cos(ang1Rad2));
        System.out.println("the true value is 0.5");
        
        
        //area of a circle
        double radius = 4.0;
        //make area variable
        double area = Math.pow(radius,2)*PI;
        //print
        System.out.println("the area of a circle with radius " + radius + " is " + area);
        
        //random numbers
        double firstRand = Math.random();
        double secondRand = (int) (firstRand *10); //gives between 0 and 9
        //how about 0 and 99
        secondRand = (int) (firstRand * 100);
        
        //how about 0 and 7
        secondRand = (int) (firstRand * (7+1));
        
        //here is the template for getting a random number from 0 to n
        //int randInt = (int) (Math.random() * (n + 1));
        
        double randDie = (int) (Math.random() * 6 + 1);
        
        //template for getting a random number from m to n
        //int randInt = (int) (Math.random() * (n-m+1) + m);
        
        System.out.println("firstRand: " + firstRand);
        System.out.println("secondRand: " + secondRand);
        System.out.println("d-6 roll: " + randDie);
        
    }
}