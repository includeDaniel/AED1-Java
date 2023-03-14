package Conteudo5;

import java.util.Scanner;

public class c05ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número do cheque (9 digitos): ");
        //123456789
        int cheque = teclado.nextInt();
        int banco = cheque / 1000000;
        int agencia = (cheque % 1000000) / 1000;
        int sequencial = cheque % 1000;

        System.out.print("Numero do cheque: " + cheque
        + "\n" + "Banco: " + banco 
        + "\n" + "Agência: " + agencia 
        + "\n" + "sequencial: " + sequencial);

        teclado.close();

    }
}
