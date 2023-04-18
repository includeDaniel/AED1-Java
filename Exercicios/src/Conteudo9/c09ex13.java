package Conteudo9;

import javax.sql.rowset.serial.SerialException;

public class c09ex13 {
    public static void main(String[] args) {
        double num = 0, den, serie = 0, fatorial = 1;
        int contador = 4;
        for (int i = 1; i <= 10; i++) {
            fatorial *= i;

            num = fatorial;

            den = Math.pow(2, i) - 1;
            
            if (i % 2 == 0) {
                serie -= num / den;
            } else {
                serie += num / den;
            }
        }
        System.out.println(serie);
    }
}
