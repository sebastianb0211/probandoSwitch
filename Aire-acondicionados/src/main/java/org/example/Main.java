package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        int temperaturaAmbiente;
        int tempertaturaDeseada;

        System.out.println("ingrese la temperatura ambiente");
        temperaturaAmbiente=teclado.nextInt();

        if (temperaturaAmbiente==20){
            temperaturaAmbiente=25;

        } else if (temperaturaAmbiente==30) {
            temperaturaAmbiente=20;

        } else if (temperaturaAmbiente==40) {
            temperaturaAmbiente=20;

        }else {
            System.out.println("señor usuario que temperatura desea: ");
            tempertaturaDeseada=teclado.nextInt();
            temperaturaAmbiente=tempertaturaDeseada;
        }
        System.out.println("Apreciado usuario su temperatura cambio a: "+temperaturaAmbiente+ " grados");

    }
}