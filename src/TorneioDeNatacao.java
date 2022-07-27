public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Luffy";
        int idade = 19;
        if (idade < 11) {
            System.out.println(nome + " Participará da categoria Infantil ");
        }else if (idade >= 11 && idade <=15) {
            System.out.println(nome+" participará da categoria Juvenil ");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome+" participará da categoria Pré-Adulto " );
        } else {;
        }
    }
}
