package Conteudo7;

import java.util.Scanner;

public class c07ex03 {
    public static void main(String[] args) {
    double imposto, multa;
    int dias;  
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do imposto: ");
        imposto = teclado.nextDouble();
        System.out.print("Digite o numero de dias: ");
        dias = teclado.nextInt();

        switch(dias) {
            case 1,2,3,4,5 -> {
                multa = 0;
            } 
            case 6,7,8 -> {
                multa = (imposto * 2 / 100);
            }
            case 9, 10 -> {
                multa = (imposto * 10 /100) + imposto * (dias * (0.5 / 100));
            }
            default -> {
                multa = (imposto * 150 / 100) + dias;
            }
        }
        System.out.print("A multa é: " + multa);
        teclado.close();
    }
}
