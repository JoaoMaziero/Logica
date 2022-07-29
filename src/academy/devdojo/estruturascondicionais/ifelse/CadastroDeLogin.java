package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println(("Forneça um nome: "));
        String nome = imput.next();
        if (nome.equalsIgnoreCase ("")  || nome.equalsIgnoreCase ( "admin") ||
                nome.equalsIgnoreCase("administrador")){
            System.out.println(nome+ " Usuário inválido");
        }else
            System.out.println(nome+" Cadastrado com sucesso");
    }

}
