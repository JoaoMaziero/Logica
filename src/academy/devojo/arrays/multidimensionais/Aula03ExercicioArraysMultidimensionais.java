package academy.devojo.arrays.multidimensionais;

import java.util.Scanner;

public class Aula03ExercicioArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMult1 = new int[3][3];
        arrayMult1[0][0] = 22;
        arrayMult1[0][1] = 11;
        arrayMult1[0][2] = 4;
        arrayMult1[1][0] = 44;
        arrayMult1[1][1] = 55;
        arrayMult1[1][2] = 9;
        arrayMult1[2][0] = 2;
        arrayMult1[2][1] = 5;
        arrayMult1[2][2] = 21;
        Scanner scanner = new Scanner(System.in);
        int resultadoDiagonalPrincipal = 1;
        for (int i = 0; i < arrayMult1.length; i++ ) {
            for (int j = 0; j < arrayMult1[i].length ; j++ ) {
              if (i == j){
                resultadoDiagonalPrincipal = resultadoDiagonalPrincipal * arrayMult1[i][j];
                }
            }
        }
                System.out.println(resultadoDiagonalPrincipal);
    }
}
