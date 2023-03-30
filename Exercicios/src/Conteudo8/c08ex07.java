package Conteudo8;

import java.util.Scanner;

public class c08ex07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome;
        int idade, cont1 = 0, cont2 = 0, soma = 0;
        double media;
        for(int i = 1; i <= 5; i++) {
            System.out.print("\nNome do aluno: ");
            nome = console.nextLine();
            System.out.print(nome + " digite sua idade: ");
            idade = console.nextInt();
            console.nextLine();

            if(idade <= 12) {
                cont1++;
            }
            
            if(idade > 30) {
                cont2++;
            }

            soma += idade;
        }
        media = soma / 5.0;

        System.out.print("\nAlunos que tem até 12 anos: " + cont1 + "\n");
        System.out.print("Alunos que tem acima de 30 anos: " + cont2 + "\n");
        System.out.print("Média das idades informadas: " + media);
        console.close();
    }
}
