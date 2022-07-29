package academy.devojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {

        final String login = "teste";
        final String passaword = "123";
        boolean exibirTelaLogin = true;
        Scanner teclado = new Scanner(System.in);

        while (exibirTelaLogin) {
            System.out.println("Digite o Login:");
            String loginDigitado = teclado.nextLine();
            System.out.println("Digite a senha: ");
            String passwordDigitado = teclado.nextLine();

            if (login.equals(loginDigitado) && passaword.equals(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
            }else {
                System.out.println("ACESSO NEGADO ");
                break;
            }
            System.out.println("PROGRAMA TERMINADO");
        }
    }
}
