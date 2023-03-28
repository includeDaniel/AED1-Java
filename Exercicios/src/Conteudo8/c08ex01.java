package Conteudo8;

import java.util.Scanner;

public class c08ex01 {
    public static void main(String[] args) {
        double r, area;
        Scanner console = new Scanner(System.in);
        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite o raio: ");
            r = console.nextDouble();
            area = 3.1416 * Math.pow(r, 2);
            System.out.println(area);
        }
        console.close();
    }
}
