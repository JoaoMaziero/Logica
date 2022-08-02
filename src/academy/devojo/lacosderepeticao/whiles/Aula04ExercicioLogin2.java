package academy.devojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin2 {
    public static void main(String[] args) {

        final String login = "teste";
        final String passaword = "123";
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o Login:");
            String loginDigitado = teclado.nextLine();
            System.out.println("Digite a senha: ");
            String passwordDigitado = teclado.nextLine();

            if (login.equals(loginDigitado) && passaword.equals(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO ");
        }
            System.out.println("PROGRAMA TERMINADO");
        }
    }
