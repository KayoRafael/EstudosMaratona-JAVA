package academy.maratona.java;

public class Aula04Operadores {
    public static void main(String[] args) {
        /*
            + SOMA
            - SUBTRAÇÃO
            / DIVISÃO
            * MULTIPLICAÇÃO
             */
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / (double) numero2;
        System.out.println(resultado);

        // % RESTO
        int resto = 21 % 9;
        System.out.println(resto);

        // Menor < > Maior / Menor Ou Igual <= >= Maior Ou Igual / == Comparando/Igualdade / != Diferente
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte = " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte = " + isDezIgualVinte);
        System.out.println("isDezIgualDez = " + isDezIgualDez);
        System.out.println("isDezDiferenteVinte = " + isDezDiferenteVinte);

        // && ( AND) || (or) !
        // && RETORNA TRUE SE AMBAS EXPRESSÕES FOREM VERDADEIRAS
        // || RETORNA TRUE SE PELO MENOS UMA DAS EXPRESSÕES FOR VERDADEIRA
        // !  INVERTE O VALOR DE UMA EXPRESSÃO BOOLEANA , SE FOR TRUE , VIRA FALSE , E VICE VERSA.

        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > +4612;
        boolean IsDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta " + IsDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        //= ATRIBUI DIRETAMENTE UM VALOR A UMA VARIAVEL
        //+= ADICIONA E ATRIBUI O RESULTADO
        //-= SUBTRAI E ATRIBUI O RESULTADO
        //*= MULTIPLICA E ATRIBUI O RESULTADO
        ///= DIVIDE E ATRIBUI O RESULTADO
        //%= CALCULA O MODULO ( RESTO DA DIVISÃO)E ATRIBUI O RESULTADO
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        // ++VARIAVEL: INCREMENTA A VARIAVEL ANTES DE USA-LA
        // VARIAVEL++: USA A VARIAVEL ANTES DE INCREMENTA-la.
        // --VARIAVEL: DECREMENTA A VARIAVEL ANTES DE USA-LA
        // VARIAVEL--: USA A VARIAVEL ANTES DE DECREMENTA-LA

        int contador = 0; // contador = contador + 1
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(++contador2); // PRIMEIRO INCREMENTA  O +1 E DEPOIS EXECUTA O CONTADOR
        System.out.println(contador2++); // PRIMEIRO EXECUTA  O +1 E DEPOIS INCREMENTA O CONTADOR
        System.out.println(contador2); // ADICIONA O +1 QUE FOI DADO ACIMA POIS LE O CONTADOR NOVAMENTE
    }
}
