package org.example;

import java.awt.*;

public class Car {

    private String Color;
    private String transmission;
    private int make;
    private int tyres;
    private int doors;


    public  Car(){

        tyres = 4;
        doors=4;
        make = 2014;
        Color = "Black";
        transmission = "Manual";
    }
    public static  void main(String[] args){
        Car toyota= new Car();
        toyota.make = 2014;
        toyota.Color = "Black";
        toyota.transmission = "Manual";
    }

    public void displayCharacteristics(){

        System.out.println(Color);
        System.out.println(transmission);
        System.out.println(make);
        System.out.println(tyres);
        System.out.println(doors);

    }

    public void accelarate(){

        System.out.println("Car is moving forward.");
    }

    public void brake(){

        System.out.println("Car has stopped.");
    }


}

