/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danis Septiya Pamuji
 */
public class TestSimpleCirclePertemuan1 {
    /** Main method
     * @param args */
    public static void main(String args[]) {
        //Membuat sebuah circle dengan radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius "
        + circle1.radius + " is " + circle1.getArea());
        
        //Membuat sebuah circle dengan radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius "
        + circle2.radius + " is " + circle2.getArea());
        
        //Membuat sebuah circle dengan radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius "
        + circle3.radius + " is " + circle3.getArea());
        
        // Modify circle radius
        circle2.radius = 100; 
        System.out.println("The area of the circle of radius "
         + circle2.radius + " is " + circle2.getArea());
        
    }
}
class SimpleCircle {
    double radius = 1;
    
    SimpleCircle() {
    }
    SimpleCircle(double radiusBaru){
        radius = radiusBaru;
    }
    //return
    double getArea() {
        return radius * radius * Math.PI;
    }
    
    //return the parameter of the circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    //atur radius baru
    double setRadius(double radiusBaru) {
        return radius =  radiusBaru;
    }
    
}
