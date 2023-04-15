package Conteudo9;

public class c09ex10C {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 100; i++) {
            num = i * 2 - 1;
            den = i * 2;
            serie += num / den;
        }
        serie = (1 / 3.0) * Math.pow(serie, 2);
        System.out.print(serie);
    }
}
