package academy.devojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {

        /* Para realizar leitura do teclado
        Scanner imput = new Scanner(System.in);
        System.out.println("forneça o tipo de conta,");
        String conta = imput.next();*/

        conta = "CONTA CORRENTE";

        switch (conta) {
            case "CONTA POUPAÇA":
            System.out.println("0,05%");
            break;
            case "CONTA CORRENTE":
            System.out.println("0,02%");
            break;
            case "CONTA INVESTIMENTO":
            System.out.println("0,01%");
            break;
            default:
            System.out.println("CONTA INEXISTENTE");
            break;
        }
    }
}


