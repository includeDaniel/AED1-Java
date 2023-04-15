package Conteudo9;

public class c09ex10F {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 100; i++) {

            num = Math.pow(i, 2);

            den = Math.pow(i * 2, 2);

            serie += num / den;
        }

        System.out.print(serie);
    }
}
