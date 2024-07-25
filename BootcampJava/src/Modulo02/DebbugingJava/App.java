package Modulo02.DebbugingJava;

public class App {
    public static void main(String[] args) {
        System.out.println("inicio o programa no método main.");
        a();
        System.out.println("Finalizou o programa no método main.");
        // o método main só será finalizado depois que o método a for finalizado
    }    

    static void a() {
        System.out.println("Entrou no métedo a.");
        b();
        System.out.println("Finalizou o métedo a.");
        // o método a só será finalizado depois que o método b for finalizado
    }

    static void b() {
        System.out.println("Entrou no métedo b.");
        for (int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o métedo b.");
        // o método b só será finalizado depois que o método c for finalizado

    }
    static void c() {
        System.out.println("Entrou no métedo c.");
        // Thread.dumpstrack();   // Começa a ler debaixo para cima no terminal
        System.out.println("Finalizou o métedo c.");

    }
    
}
