package Conteudo12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class c12ex17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String arr[] = new String[10], tempArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Type any value: ");
            arr[i] = console.nextLine();
        }
        console.close();
        for (int i = 0; i < arr.length / 2; i++) {
            tempArr = arr[((arr.length - 1) - i)];
            arr[((arr.length - 1) - i)] = arr[i];
            arr[i] = tempArr;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
