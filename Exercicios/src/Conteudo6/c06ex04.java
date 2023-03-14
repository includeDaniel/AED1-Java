package Conteudo6;

import java.util.Scanner;

public class c06ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        // String name = teclado.nextLine();
        System.out.print("Digite a sua altura(metros): ");
        double altura = teclado.nextDouble();
        System.out.print("Digite o seu peso: ");
        double peso = teclado.nextDouble();

        double IMC = peso / Math.pow(altura, 2);

        if (IMC < 18) {
            System.out.print("Pessoa está desnutrida");
        } else if (IMC < 20) {
            System.out.print("Pessoa está abaixo do peso");
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.print("Pessoa está no peso ideal");
        } else if (IMC > 25 && IMC <= 27) {
            System.out.print("Pessoa está acima do peso");
        } else {
            System.out.print("Pessoa está obesa");
        }

        teclado.close();
    }
}
