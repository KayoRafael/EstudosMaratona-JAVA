package academy.maratona.java;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar Se Salario for > 5000

        double salario = 5001;
        String mensagemDoar = "Eu Vou Doar";
        String mensagemNãoDoar = "Não Irei Doar!";

        // (condicao) ? verdadeiro : falso;

        // OPERADOR TERNARIO

        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;

        System.out.println(resultado);
    }
}

