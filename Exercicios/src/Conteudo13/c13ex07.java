package Conteudo13;

import java.util.Scanner;

public class c13ex07 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomeFamilia, nome;

        System.out.print("Digite seu nome completo: ");
        nome = console.nextLine();
        String[] sobrenome = nome.split(" ", nome.split(" ").length);
        System.out.println("o seu nome de familia é: " + sobrenome[nome.split(" ").length - 1]);

        console.close();
    }
}
