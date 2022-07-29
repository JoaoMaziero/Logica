package academy.devojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExerciciosImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("forneca o numero :");
        int valorFinal  = teclado.nextInt();
        int i = 0 ;
        while ( i <= valorFinal) {
            if (i % 2 != 0) {
                System.out.println("Impar ->" + i);
            }
            i = i+1;
        }
    }


}
