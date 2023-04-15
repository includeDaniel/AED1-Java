package Conteudo9;

public class c09ex11D {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 100; i++) {

            num = Math.pow(i, 3);

            den = Math.pow(10, i - 1);
            serie += num / den;
        }

        System.out.print(serie);
    }
}
