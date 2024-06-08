package academy.maratona.java;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7 , imprima se e dia util ou final de semana
        // considerando 1 como domingo
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final De Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
    }
}
