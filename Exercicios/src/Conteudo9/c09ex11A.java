package Conteudo9;

public class c09ex11A {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 100; i++) {

            num = i + (i + (6 * (i - 1)));

            den = Math.pow(4, i - 1);

            serie += num / den;
        }
        serie = Math.cbrt(serie);
        System.out.print(serie);
    }
}
