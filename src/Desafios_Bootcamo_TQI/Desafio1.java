package Desafios_Bootcamo_TQI;

import java.util.Scanner;
/*
*Proibida a entrada de Menores
* */
public class Desafio1 {
    public static void main(String[] args) {
        //a classe Scanner auxilia na leitura dos dados de entrada
        Scanner scan = new Scanner(System.in);

        int N= scan.nextInt();
        String string = scan.nextLine();

        //quebra string em várias substrings a partir de um caracter
        String[] s = string.split(" ");

        int[] idade = new int[N];
            for (int i = 0; i < N; i++){
            idade[i] = scan.nextInt();
            /*Aqui, poderia converter os valores do Array s para o Arrya idade (de String para Int)
            * mas já estou recebendo os dados do scan
            * */
        }

        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < N; i++){
            if (idade[i] < 18){
                System.out.println(idade[i]);
            }
        }
    }
}
