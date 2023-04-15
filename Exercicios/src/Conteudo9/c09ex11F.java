package Conteudo9;

public class c09ex11F {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 100; i++) {

            num = (i + 1 * (i - 1)) * (Math.pow(2, i + 1));

            den = Math.pow(i + 1 + 4 * (i - 1), 2);

            serie += num / den;
        }
        serie = 5 * Math.sqrt(serie);
        System.out.print(serie);
    }
}
