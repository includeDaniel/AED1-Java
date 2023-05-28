import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) {
        int n;
        Scanner console = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = console.nextInt();
        console.close();
        System.out.println(ClasseCalculaFatorial.MetodoCalculaFatorial(n));
    }
}
