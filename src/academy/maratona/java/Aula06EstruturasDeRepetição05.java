package academy.maratona.java;

public class Aula06EstruturasDeRepetição05 {
    public static void main(String[] args) {
        double valorCarro = 40000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcela + "R$ " + valorParcela);
        }
    }
}

