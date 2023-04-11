package Conteudo8;

public class c08ex23 {
    public static void main(String[] args) {
        int d1, d2, d3, d4, cont = 0, soma = 0, media;
        for (int i = 1000; i <= 9999; i++) {
            d1 = i / 1000;
            d2 = (i % 1000) / 100;
            d3 = (i % 100) / 10;
            d4 = i % 10;
            if (d1 + d3 == d2 + d4 && d2 == d3) {
                soma += i;
                cont++;
                System.out.println(i);
            }
        }
        media = soma / cont;
        System.out.print("A média é: " + media);
    }
}
