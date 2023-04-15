package Conteudo9;

public class c09ex08 {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 20; i++) {

            num = (i * 2 + 1) * Math.sqrt(i * 4 + 1);

            den = Math.pow(5, i);

            serie += num / den;
        }
        serie = Math.pow(serie, 2);
        System.out.print(serie);
    }
}
