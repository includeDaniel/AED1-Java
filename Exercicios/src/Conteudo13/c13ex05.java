package Conteudo13;

import java.util.Scanner;

public class c13ex05 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a, r;
        System.out.print("Digite um ângulo: ");
        a = console.nextDouble();
        r = TransformaEmRadiano(a);
        FuncoesTrigonometricas(r);
        console.close();
    }

    public static void FuncoesTrigonometricas(double a) {
        double sin, cos, tan, asin, acos, atan;
        sin = Math.sin(a);
        cos = Math.cos(a);
        tan = Math.tan(a);
        asin = 1 / (Math.sin(a));
        acos = 1 / (Math.cos(a));
        atan = 1 / (Math.tan(a));

        System.out.println("Seno: " + sin);
        System.out.println("Cosseno: " + cos);
        System.out.println("Tangente: " + tan);
        System.out.println("Arco Seno: " + asin);
        System.out.println("Arco Cosseno: " + acos);
        System.out.println("Arco Tangente: " + atan);
    }

    public static double TransformaEmRadiano(double a) {
        double r = a * (Math.PI / 180);
        return r;
    }
}
