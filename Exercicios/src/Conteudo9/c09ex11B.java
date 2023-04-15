package Conteudo9;

public class c09ex11B {
    public static void main(String[] args) {
        double num, den, serie = 0;
        for (int i = 1; i <= 100; i++) {

            num = i + (2 * (i - 1));
            den = Math.sqrt(i + (i + 2) * 2);
            serie += num / den;
        }
        serie = (5 / 3.0) * serie;
        System.out.print(serie);
    }
}
