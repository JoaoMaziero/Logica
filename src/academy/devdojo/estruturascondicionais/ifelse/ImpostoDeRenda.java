package academy.devdojo.estruturascondicionais.ifelse;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 50000D;
        if ( salario <= 1903.98){
            System.out.println("ISENTO");
        }else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("7,5% " + (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 37510.05) {
            System.out.println("15% "+ (salario * 0.15));
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("22,5 % "+ (salario * 0.226));
        } else {
            System.out.println("27,5 % "+ (salario * 0.275) );
        }
    }
}
