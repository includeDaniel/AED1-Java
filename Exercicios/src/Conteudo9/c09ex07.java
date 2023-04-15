package Conteudo9;

public class c09ex07 {
    public static void main(String[] args) {
        double num, den, serie = 0;

        for (int i = 1; i <= 6; i++) {

            num = (i - 1) * 2 + i * 3;

            den = i * 6 + 1;

            serie += num / den;
        }

        System.out.print(serie);
    }
}
