package Conteudo9;

public class c09ex11C {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 100; i++) {

            num = (i * 2 + 1) * Math.sqrt(4 * i + 1);

            den = Math.pow(5, i);

            serie += num / den;
        }
        serie = Math.pow(serie, 2);
        System.out.print(serie);
    }
}
