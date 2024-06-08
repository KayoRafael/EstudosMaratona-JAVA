package academy.maratona.java;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizado = idade >= 18;
        // ! NEGAÇÃO

        if (isAutorizado != false) {
            System.out.println("Acesso Autorizado");
        } else {
            System.out.println("Acesso Negativo");
        }

        if (!isAutorizado) {
            System.out.println("Acesso Negado");
        }
    }
}

