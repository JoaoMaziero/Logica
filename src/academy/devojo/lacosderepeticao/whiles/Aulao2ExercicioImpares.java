package academy.devojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aulao2ExercicioImparespublic static void main(String[] args) {

    Scanner teclado =  new Scanner((System.in));
    System.out.println("Digite o valor desejado ");
    int valorFinal = teclado.next();

    int i = 0;

    while ( i <= valorFinal ) {
        if (i % 2 != 0) {
            System.out.println("testando whhile impar" + i);
        }
        contador = contador + 1 ;
    }

}



