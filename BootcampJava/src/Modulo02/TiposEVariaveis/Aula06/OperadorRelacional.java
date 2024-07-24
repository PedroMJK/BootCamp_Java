package Modulo02.TiposEVariaveis.Aula06;

public class OperadorRelacional {

    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        // String
        String nomeUm = "Pedro";
        String nomeDois = new String("Pedro");

        boolean simNao = numero1 == numero2;

        System.out.println("numero1 é igual a numero2? " + simNao);

        //Usando com condições
        if (numero1 < numero2) {
            System.out.println("A nossa  condição é verdadeira");
        }

        // Para objetos o ideal é usar o .equals, para comparar se os objetos são semelhantes
        System.out.println(nomeUm.equals(nomeDois)); // Apesar de o nomeDois criar um new objeto, o dois são iguais.
    }
}