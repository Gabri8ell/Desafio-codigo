package Desafios_Bootcamo_TQI;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int qtdTestes = Integer.parseInt(leitor.nextLine());

        String linha1[], linha2[], j1, escolha1, j2, escolha2;
        int NUM1, NUM2;
        String vencedor;

        for (int i = 0; i < qtdTestes; i++) {

            //quebra string em várias substrings a partir de um caracter
            linha1 = leitor.nextLine().split(" ");
            linha2 = leitor.nextLine().split(" ");

            //pegar numeros
            NUM1 = Integer.parseInt(linha2[0]);
            NUM2 = Integer.parseInt(linha2[1]);

            j1 = linha1[0];
            escolha1 = linha1[1];

            j2 = linha1[2];
            escolha2 = linha1[3];

            if((NUM1 + NUM2) % 2 == 0){
                 vencedor = (escolha1.equalsIgnoreCase("PAR"))? j1 : j2;
            }
            else{
                 vencedor = (escolha1.equalsIgnoreCase("IMPAR"))? j1 : j2;
            }

            System.out.println(vencedor);
        }
    }
}
