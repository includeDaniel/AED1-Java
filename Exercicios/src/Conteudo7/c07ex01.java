package Conteudo7;

import java.util.Scanner;

public class c07ex01 {
    public static void main(String[] args) {
        String nome;
        int acertos, valorGanho;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do apostador: ");
        nome = teclado.nextLine();
        System.out.print("Digite o número de acertos: ");
        acertos = teclado.nextInt();

        switch (acertos) {
            case 1, 2, 3, 4 , 5 -> {
                valorGanho = 0;
                System.out.print(nome + "Ganhou nenhum prêmio");
            }
            case 6, 7, 8, 9, 10 -> {
                System.out.print(nome +" Ganhou outro cartão");
            }
            case 11 -> {
                valorGanho = 100;
                System.out.print(nome +" Ganhou R$ " + valorGanho);
            }
            case 12 -> {
                valorGanho = 1000;
                System.out.print(nome +" Ganhou R$ " + valorGanho);
            }
            case 13 -> {
                valorGanho = 50000;
                System.out.print(nome + " Ganhou R$ " + valorGanho);
            }
            default -> 
            System.out.print("Digite um numero de 1 até 13"); 
        }
        teclado.close();
    }
}
