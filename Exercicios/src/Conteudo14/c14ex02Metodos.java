package Conteudo14;

public class c14ex02Metodos {
    public static void AreaQuadrado() {
        double l;
        System.out.println();
        System.out.print("Digite o lado: ");
        l = c14ex02Main.console.nextDouble();
        System.out.println("A área é: " + (l * l));
    }

    public static void AreaRetangulo() {
        double b, a;
        System.out.println();
        System.out.print("Digite a base: ");
        b = c14ex02Main.console.nextDouble();
        System.out.print("Digite a altura: ");
        a = c14ex02Main.console.nextDouble();
        System.out.println("A área é: " + (b * a));
    }

    public static void AreaTrianguloRetangulo() {
        double b, a;
        System.out.println();
        System.out.print("Digite a base: ");
        b = c14ex02Main.console.nextDouble();
        System.out.print("Digite a altura: ");
        a = c14ex02Main.console.nextDouble();
        System.out.println("A área é: " + ((b * a) / 2.0));
    }

    public static void AreaCirculo() {
        double r;
        System.out.println();
        System.out.print("Digite o raio: ");
        r = c14ex02Main.console.nextDouble();
        System.out.println("A área do cirulo: " + (Math.PI * Math.pow(r, 2.0)));
    }
}
