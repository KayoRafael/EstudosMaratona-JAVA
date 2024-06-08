package academy.maratona.java;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15  && idade < 18 categoria juvenil
        // idade >= 18  && idade < 18 categoria adulto

        int idade = 43;
        String categoria;

        if (idade < 15) {
            categoria = ("Categoria Infantil");

        } else if (idade >= 15 && idade < 18) {
            categoria = ("Categoria Juvenil");

        } else {
            categoria = ("Categoria Adulto");
        }

        // OPERADOR TERNARIO , NÃO RECOMENDADO

        // categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade <18 ? "Categoria Juvenil" : "Categoria Adulto";

        System.out.println(categoria);
    }
}
