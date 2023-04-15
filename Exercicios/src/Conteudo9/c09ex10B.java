package Conteudo9;

public class c09ex10B {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 100; i++) {

            num = i * 2;

            den = i * 3;

            serie += num / den;
        }
        serie = 1 + Math.sqrt(serie);
        System.out.print(serie);
    }
}
