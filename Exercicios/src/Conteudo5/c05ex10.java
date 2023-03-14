package Conteudo5;

import java.util.Scanner;

public class c05ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número de 5 digitos: ");
        //12345
        int numero = teclado.nextInt();
        int primeiroDigito = numero / 10000;
        int segundoDigito = (numero % 10000) / 1000;
        int terceiroDigito = (numero % 1000) / 100;
        int quartoDigito = (numero % 100) / 10;
        int quintoroDigito = numero % 10;
        System.out.print( primeiroDigito + "\n" + segundoDigito + "\n" + terceiroDigito + '\n' + quartoDigito +'\n' + quintoroDigito ); 
        teclado.close();
    }

}
