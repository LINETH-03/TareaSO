package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("cara o cruz");
        aleatorio();




    }
    public  static void aleatorio() {
        Random numAleatorio = new Random();


        boolean moneda = numAleatorio.nextBoolean();


        if (moneda) {
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }



    }


}
