package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En este ejercicio el usuario introducirá dos números y el programa lor ordenará de mayor a menor");

        //Pedimos al usuario que introduzca el primer número
        System.out.println("Introduzca el primer número");
        //Guardamos en la variable el primer valor
        double num1 = sc.nextDouble();
        System.out.println("Introduzca el segundo número");
        double num2 = sc.nextDouble();
        System.out.println("Introduzca el tercer número");
        double num3 = sc.nextDouble();


        //Se hacen las comparaciones para ordenarlos

        if (num1>num2&&num2>num3) {
            System.out.println(num1+" "+num2+" "+num3);
        } else if (num1>num3&&num3>num2) {
            System.out.println(num1+" "+num3+" "+num2);
        } else if (num2>num1&&num1>num3) {
            System.out.println(num2+" "+num1+" "+num3);
        } else if (num2>num3&&num2>num1) {
            System.out.println(num2+" "+num3+" "+num1);
        } else if (num3>num1&&num1>num2) {
            System.out.println(num3+" "+num1+" "+num2);
        } else if (num3>num2&&num2>num1) {
            System.out.println(num3+" "+num2+" "+num1);
        } else {
            System.out.println("Hay números que se repiten  y no se pueden ordenar");
        }

    }

}