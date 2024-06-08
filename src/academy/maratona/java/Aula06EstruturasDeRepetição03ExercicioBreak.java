package academy.maratona.java;

public class Aula06EstruturasDeRepetição03ExercicioBreak {
    public static void main(String[] args) {
        int limite = 25;

        // Incremeto um valor 0, para ter algo guardado na memoria , indico que o valor tem que ser < 50 ,
        // e adiciono a Incremetação pra somar 1( i++ ) ate o limite que foi definido na variavel int

        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            if (i == limite) {
                break;  // Sai do loop quando o valor do limite for atingido
            }
        }
    }
}

