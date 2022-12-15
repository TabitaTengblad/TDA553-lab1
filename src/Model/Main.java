package model;

public class Main {
    public static void main(String[] args) {
        Volvo240 volvo = new Volvo240();

        System.out.println("X: " + volvo.getX());
        System.out.println("y: " + volvo.getY());

        System.out.println("Speed: " + volvo.getCurrentSpeed());
        System.out.println("------------");
        volvo.startEngine();
        volvo.gas(0.7);
        volvo.move();
        System.out.println("------------");
        System.out.println("Speed: " + volvo.getCurrentSpeed());
        System.out.println("X: " + volvo.getX());
        System.out.println("y: " + volvo.getY());
        volvo.gas(0.7);
        volvo.move();
        System.out.println("Speed: " + volvo.getCurrentSpeed());
        System.out.println("X: " + volvo.getX());
        System.out.println("y: " + volvo.getY());
        System.out.println("------------");
        volvo.brake(0.5);
        volvo.move();
        System.out.println("Speed: " + volvo.getCurrentSpeed());
        System.out.println("X: " + volvo.getX());
        System.out.println("y: " + volvo.getY());
    }
    
}

//kolla så metodrna gör som de ska