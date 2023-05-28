package Conteudo14.ProjetoAED1;

public class ClasseCalculaFatorial {
    public static void CalculaFatorial() {
        System.out.print("Informe um número: ");
        long numero = Menu1.console.nextLong();
        long fatorial = 1;
        for (long contador = 2; contador <= numero; contador++) {
            fatorial = fatorial * contador;
        }
        System.out.println("Fatorial = " + fatorial);
        Menu1.console.close();
    }
}
