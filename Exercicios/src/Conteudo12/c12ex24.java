package Conteudo12;

import java.util.Scanner;

public class c12ex24 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int arr[] = new int[10], arr2[] = new int[10], cont = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Digite um valor inteiro: ");
            arr[i] = console.nextInt();
        }
        console.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                arr2[cont] = arr[i];
                cont++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
