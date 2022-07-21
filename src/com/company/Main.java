package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingresa Nombre");



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
