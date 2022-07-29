package academy.devojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o número");
        int dia = imput.nextInt();

        if (dia == 1){
            System.out.println("Segunda feira");
        } else if (dia == 2) {
            System.out.println("terça feira");
        }else if (dia == 3){
            System.out.println("quarta feira");
        }else if (dia == 4){
            System.out.println("quinta feira");
        }else if (dia == 5){
            System.out.println("sexta feira");
         }else if (dia == 6){
        System.out.println("sabado");
         }else if (dia == 7) {
            System.out.println("domingo");
        } else {
            System.out.println("Dia Inválido");
        }
    }
}

