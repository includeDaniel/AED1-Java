package Conteudo13;

import java.util.Scanner;

public class c13ex06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomeFamilia, nome;
        int cont = 0;

        System.out.print("Digite o nome de uma família: ");
        nomeFamilia = console.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um nome completo: ");
            nome = console.nextLine();
            String[] sobrenome = nome.split(" ", nome.split(" ").length);
            if (sobrenome[nome.split(" ").length - 1].equalsIgnoreCase(nomeFamilia)) {
                cont++;
            }
        }
        System.out.println(cont + " pessoas podem ser dessa família");

        console.close();
    }
}
