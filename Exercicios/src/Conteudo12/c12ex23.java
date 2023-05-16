package Conteudo12;

import java.util.Scanner;

public class c12ex23 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome[] = new String[5],  placa[] = new String[5], pesquisa;

        for(int i = 0; i< nome.length; i++) {

            System.out.print("Digite o nome do dono da vaga: ");
            nome[i] = console.nextLine();

            System.out.print("Digite a placa do carro: ");
            placa[i] = console.nextLine();
        }
        System.out.println();
        System.out.print("Digite o nome de um morador ou placa de um carro: ");
        pesquisa = console.nextLine();
        System.out.println();
        console.close();

        for(int i = 0; i < nome.length; i++) {
            if(nome[i].equalsIgnoreCase(pesquisa) || placa[i].equalsIgnoreCase(pesquisa)) {
                System.out.print("O número da vaga é: " + (i + 1));
            }
        }
    }
}
