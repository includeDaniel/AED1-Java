package Conteudo9;

public class c09ex12 {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 10000; i++) {

            num = 1;

            den = (i + 1 * (i - 1));

            if (i % 2 == 0) {
                serie -= num / den;
            } else {
                serie += num / den;
            }

        }
        serie = 4 * serie;
        System.out.print(serie);
    }
}
