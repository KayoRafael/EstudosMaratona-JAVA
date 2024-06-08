package academy.maratona.java;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        // €0   €34,712     9.78%
        // €34,713  €68,507     37.35%
        // €68,508     49.50%
        double salarioAnual = 70000;
        double resultado = 0;

        if (salarioAnual <= 34713) {
            resultado = salarioAnual * 9.78 / 100;

        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            resultado = salarioAnual * 37.35 / 100;

        } else if (salarioAnual >= 68507) {
            resultado = salarioAnual * 49.50 / 100;
        }

        String resultadoFormatado = String.format("%.2f", resultado);

        System.out.println("R$" + resultadoFormatado);
    }
}
