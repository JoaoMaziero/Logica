package academy.devojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0F;
        String porcentagem = "";
        if (salario > 4500){
            resultado = salario * 0.30F;
            porcentagem = "30%";
                  }else {
            resultado = salario * 0.10F;
            porcentagem ="10%";
        }
        System.out.println("O valor final em porcentagem de "+porcentagem+" é de "+ resultado);
    }

    public static class Aula01DiasSemana {

        public static void main(String[] args) {

            Scanner teclado =  new Scanner((System.in));
            System.out.println("Digite o dia: ");
            int dia = teclado.nextInt();

            switch ( dia ) {

                case 1:
                    System.out.println("Segunda Feira");
                    break;
                case 2:
                    System.out.println("Terça Feira");
                    break;
                case 3:
                    System.out.println("Quarta Feira");
                    break;
                case 4:
                    System.out.println("Quinta Feira");
                    break;
                case 5:
                    System.out.println("Sexta Feira");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Dia Inválido");
                    break;
            }
        }

    }
}
