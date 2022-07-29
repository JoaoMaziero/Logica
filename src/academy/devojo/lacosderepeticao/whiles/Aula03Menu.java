package academy.devojo.lacosderepeticao.whiles;

import java.util.Scanner;
import java.util.WeakHashMap;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
        System.out.println("digite a opção desejada :");
        System.out.println(" 1. -> Calcular Imposto  ");
        System.out.println(" 2. -> Depositar Salárioo");
        System.out.println(" 3. -> Sair");
        opcao = teclado.nextInt();
        }
        System.out.println("Programa Encerrado");
    }
}





