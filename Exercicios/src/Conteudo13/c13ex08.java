package Conteudo13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c13ex08 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nome, charTemp;
        List<String> Char = new ArrayList<String>();
        System.out.println("Digite o nome de algum autor: ");
        nome = console.nextLine();

        String[] sobrenome = nome.split(" ");

        for (int i = 0; i < sobrenome.length - 1; i++) {
            charTemp = sobrenome[i].substring(0, 1);
            Char.add(charTemp);
        }
        charTemp = Char.toString().replace('[', ' ').replace(']', '.').replace(',', '.').trim();
        System.out.println(sobrenome[nome.split(" ").length - 1].toUpperCase() + ", " + charTemp);
        console.close();
    }
}
