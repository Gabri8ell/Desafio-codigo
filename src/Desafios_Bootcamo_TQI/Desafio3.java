package Desafios_Bootcamo_TQI;

import java.util.Scanner;
/*
* Distância entre dois pontos
**/
public class Desafio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String x1y1 = scan.nextLine();
        System.out.println(x1y1);
        //String ascan = scan.nextLine();
        String x2y2 = scan.nextLine();
        //System.out.println(x2y2);

        String[] aux = x1y1.split(" ");
        String[] aux1 = x2y2.split(" ");

        float x1 = Float.parseFloat(aux[0]);
        float y1 = Float.parseFloat(aux[1]);
        float x2 = Float.parseFloat(aux1[0]);
        float y2 = Float.parseFloat(aux1[1]);

        System.out.println("(" + x2 + " - " + x1 + ")² + ( "+ y2 + " - " + y1 + ")²");
        System.out.printf("Resultado : %.4f",  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

    }

}

