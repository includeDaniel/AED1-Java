package Conteudo12;

import java.util.Scanner;

public class c12ex13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String meses[] = new String[12], temp;
        for (int i = 0; i < meses.length; i++) {
            System.out.print("Digite os meses 1 por 1: ");
            meses[i] = console.nextLine();
        }
        console.close();
        for (int i = 0; i < meses.length - 1; i++) {
            for (int j = 0; j < meses.length - 1; j++) {
                if (meses[j].compareToIgnoreCase(meses[j + 1]) > 0) {
                    temp = meses[j];
                    meses[j] = meses[j + 1];
                    meses[j + 1] = temp;
                }

            }

        }
        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i]);
        }
    }
}
