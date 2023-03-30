package Conteudo8;

import java.util.Scanner;

public class c08ex04 {
    public static void main(String[] args) {
        String nome;
        int idade, cont1 = 0, cont2 = 0;
        Scanner console = new Scanner(System.in);
        for(int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome = console.nextLine();
            System.out.print( nome + " digite a sua idade: ");
            idade = console.nextInt();
            if(idade <= 18) {
                cont1++;
            } else {
                cont2++;
            }
            console.nextLine();
        }
        System.out.print("\n\nAté 18: " + cont1);
        System.out.print("\nAcima de 18: " + cont2);
        console.close();
    }
}
