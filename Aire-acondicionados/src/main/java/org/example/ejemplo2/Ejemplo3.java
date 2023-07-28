package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int temperaturaActual;


        System.out.println("Digite la temperatura actual");
        temperaturaActual=teclado.nextInt();

        switch (temperaturaActual){
            case 20:
                temperaturaActual=25;
                break;
            case 30:
                temperaturaActual=20;
                System.out.println("te estas muriendo");
                break;
            default:
                System.out.println("que temperatura quiere");
                temperaturaActual=teclado.nextInt();
        }
    }
}
