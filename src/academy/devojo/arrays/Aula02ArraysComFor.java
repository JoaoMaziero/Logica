package academy.devojo.arrays;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas =  new double[4];
        System.out.println("-----------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Digite a nota "+ (i+1));
            notas[i] = scanner.nextDouble();
            System.out.println(notas[i]);
        }
        double media = 0;
        for (int i =0; i < notas.length ; i++) {
            media = media + notas[i];
            System.out.println("Notas "+ (i + 1) + " : " + notas[i]);
        }
        System.out.println("Soma da notas" + media);
        media = media / notas.length;
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Média das Notas" + media);
    }
}
