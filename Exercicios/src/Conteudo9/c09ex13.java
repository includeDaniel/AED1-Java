package Conteudo9;

public class c09ex13 {
    public static void main(String[] args) {
        double num, den, serie = 0;
        double soma = 1;
        for (int i = 1; i <= 10; i++) {

            num = i * i * i;

            den = Math.pow(2, i) - 1;
            serie += num / den;
        }

        System.out.print(serie);
    }
}
