package Conteudo4;

import java.util.Scanner;

public class c04ex01 {
    public static void main(String[] args) {
        String firstName, middleName, surName;
        int age;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu primeiro nome: ");
        firstName = teclado.nextLine();
        System.out.print("Digite o seu nome do meio: ");
        middleName = teclado.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        surName = teclado.nextLine();
        System.out.print("Digite sua idade: ");
        age = teclado.nextInt();
        System.out.println(surName + ", " + firstName + " " + middleName);
        System.out.println("idade: "+ age);
        teclado.close();
    }
}
