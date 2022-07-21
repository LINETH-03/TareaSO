package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("cara o cruz");




    }
    public  void aleatorio(){
        Random numAleatorio = new Random();

// Genera un boolean de forma aleatoria
        boolean moneda = numAleatorio.nextBoolean();

// Si es verdadero cara y sino cruz
        if (moneda) {
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }



    }


}
