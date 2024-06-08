package academy.maratona.java;

public class Aula06EstruturasDeRepetição04ExercicioBreak2 {
    public static void main(String[] args) {
        // Dado o valor de um carro , descubra quantas vezes ele pode ser parcelado
        // Condição valor da parcela >= 1000
        double valorCarro = 40000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
        }
    }
}
