package Modulo02.TiposEVariaveis.Aula05;

public class OperadorTernario {

    public static void main(String[] args) {
        int a, b;

        a = 7;
        b = 8;

        // Com String
        String resultado = "";
        if (a == b) 
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        // Modelo abreviado / Operador ternário
        String resultado2 = a == b ? "Verdadeiro2" : "Falso2";

        // Com Int
        int resultado3 = a == b ? 1 : 0;

        System.out.println(resultado);
        System.out.println(resultado2); // Com String
        System.out.println(resultado3); // Com Int
    }
}