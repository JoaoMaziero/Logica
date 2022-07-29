package academy.devojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner((System.in));
        System.out.println(" Digite seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        if (idade < 11) {
            System.out.println(nome +" Tem "+ idade +" e  Participará da categoria Infantil ");
        }else if (idade >= 11 && idade <=15) {
            System.out.println(nome +" Tem "+ idade +" e Participará da categoria Juvenil ");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome +" Tem "+ idade +" e Participará da categoria Pré-Adulto " );
        } else {;
        }
    }
}
