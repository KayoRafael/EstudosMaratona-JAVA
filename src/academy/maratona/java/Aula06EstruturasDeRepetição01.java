package academy.maratona.java;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // While: Verifica antes, pode não executar nenhuma vez.
        // Do-While: Executa pelo menos uma vez, verifica depois.
        // For: Melhor para um número conhecido de iterações, tudo em uma linha.

        int count = 0;
        while (count < 11) {
            System.out.println(count);
            count = count + 1;
        }

        // do while EXECUTA PELO MENOS 1X MESMO SE A CONDIÇÃO FOR FALSA

        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
