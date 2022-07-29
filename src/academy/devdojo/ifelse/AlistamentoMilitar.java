package academy.devdojo.ifelse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        char sexo = ' ';
        System.out.println("Digite o sexo M  p/ mssculino e F p/ Feminino :");
        sexo = imput.next().charAt(0);
        System.out.println("Digite a idade :");
        int idade = imput.nextInt();

        if ( (sexo == 'M' || sexo =='F') && idade < 18) {
            System.out.println("alistamento não permitido");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("alistamento obrigatório!!!");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar!!! ");
        }
    }
}
