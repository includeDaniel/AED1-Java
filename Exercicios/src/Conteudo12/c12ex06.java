package Conteudo12;

import java.util.Scanner;

public class c12ex06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String month[] = new String[12];
        for (int i = 0; i <= (month.length - 1); i++) {
            System.out.print("Digite o nome do mês: ");
            month[i] = console.nextLine();
        }
        for (int j = 0; j <= 11; j++) {
            System.out.println(month[11 - j]);
        }

        console.close();
    }
}
