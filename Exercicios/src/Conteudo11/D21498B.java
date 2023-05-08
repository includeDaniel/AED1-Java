//Daniel Nunes da Silva
package Conteudo11;

public class D21498B {
    public static void main(String[] args) {
        double num, den, serie = 0;
        int term = 1, term2 = 4;
        for (int i = 1; i <= 5; i++) {

            num = Math.pow(i + 3.0, 2.0) + Math.sqrt(term2) ;

            den = Math.pow(term, i *2.0);

            term += 2.0;
            term2 += 7.0;
            serie += num / den;

       ;
        }
        serie = (10 * serie ) - 5;

        System.out.print(serie);
    }
}
