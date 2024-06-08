package academy.maratona.java;

public class Aula06EstruturasDeRepetição02ExercioFor {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 até 1000000
        // i = usado para incrementação , % o resto que se divido for por 2 == 0 é par
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
