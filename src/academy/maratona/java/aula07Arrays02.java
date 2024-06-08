package academy.maratona.java;

public class aula07Arrays02 {
    public static void main(String[] args) {
        // caso nao possuo valor , eo array ser maior , esses serão os impressos em cada variavel
        // byte , short , int , long , float e double 0
        // char '\u0000'  ' '
        // boolean false
        // String null

        final int tamanho = 4;
        String[] nomes = new String[tamanho];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";
        nomes[3] = "Kirito";

        // CRIAR O ARRAYS JA COM ELEMENTOS DENTRO DELE
//        String[] nomes={"Naruto","Goku","Luffy","Kirito"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
            // int = i = inicializando = em zero 0
            // .length é usado para determinar o tamanho ou comprimento de arrays
            // i dentro do Sout para imprimir todos os arrays
        }

        for (String n : nomes) {
            System.out.println(n);
            // outro metodo de imprimir arrays
        }
    }
}
