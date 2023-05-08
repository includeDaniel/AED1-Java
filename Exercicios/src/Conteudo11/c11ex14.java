package Conteudo11;

public class c11ex14 {
    public static void main(String[] args) {
        int cont = 0;
        double serie = 0, num, den, denSoma = 1, pi = 0;
        do {
            num = 1;
            den = denSoma;

            if (cont % 2 == 0) {
                serie += num / den;
            } else {
                serie -= num / den;
            }

            denSoma += 2;
            pi = 4 * (serie);
            cont++;

            if (pi > 3.1416 && pi < 3.1417) {
                break;
            }

        } while (pi != 0);

        System.out.print(cont);
    }
}
