package Modulo02.AnatomiaClasses.Aula03;

public class App03 {
    public static void main(String[] args) {
        
        String primeiroNome = "Pedro";
        String segundoNome = "Monteiro";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        System.out.println("Hello World");
        System.out.println("Meu nome é Pedro");
    }

    //Segundo método
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
