package academy.devojo.arrays;

import java.util.Scanner;

public class Aula03ExercicioArrays {
    public static void main(String[] args) {

        int [] array1 =  new int[3];
        int [] array2 =  new int[3];
        int [] array3 =  new int[3];
        System.out.println("-----------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length ; i++) {
            System.out.println("Vetpr 1 posição "+ i +" : " );
            array1[i] = scanner.nextInt();
        }
        for (int i =0; i < array2.length ; i++) {
            System.out.println("Vetor 2 posição "+ array2[i] + " : " );
            array2[i] = scanner.nextInt();
        }
        System.out.println("Vetor 3 multiplicado");
        for (int i =0; i < array3.length ; i++) {
            System.out.println("Vetor 1 posicao " + i + " = " + array1[i] + "  Vetor 2 posicao " +i + " = "+ array2[i]);
            array3[i] = array1[i] * array2[i];
            System.out.println("   Vetor 3  posicao "+ i + " = "+ array3[i] );
        }
    }
}
