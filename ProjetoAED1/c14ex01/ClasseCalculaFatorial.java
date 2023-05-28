public class ClasseCalculaFatorial {
    public static int MetodoCalculaFatorial(int n) {
        int fatorial = 1;
        for (int contador = 2; contador <= n; contador++) {
            fatorial = fatorial * contador;
        }
        return fatorial;
    }
}
