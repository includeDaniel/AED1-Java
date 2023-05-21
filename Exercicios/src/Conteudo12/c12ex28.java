package Conteudo12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c12ex28 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<String> RA = new ArrayList<String>();
        List<String> nome = new ArrayList<String>();
        String raTemp, nomeTemp;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o RA do aluno: ");
            raTemp = console.nextLine();
            RA.add(raTemp);
            System.out.print("Digite o nome do aluno: ");
            nomeTemp = console.nextLine();
            nome.add(nomeTemp);
        }

        for (int i = 0; i < RA.size() - 1; i++) {
            for (int j = 0; j < nome.size() - 1; j++) {
                if (nome.get(i).compareToIgnoreCase(nome.get(i + 1)) > 0) {
                    nomeTemp = nome.get(i);
                    nome.set(i, nome.get(i + 1));
                    nome.set(i + 1, nomeTemp);

                    raTemp = RA.get(i);
                    RA.set(i, RA.get(i + 1));
                    RA.set(i + 1, raTemp);
                }
            }
        }
        System.out.print("Digite o nome de algum aluno: ");
        nomeTemp = console.nextLine();

        if (nome.indexOf(nomeTemp) >= 0) {
            System.out.println(nomeTemp + " tem o RA: " + RA.get(nome.indexOf(nomeTemp)) + " e está na posição: "
                    + (nome.indexOf(nomeTemp) + 1));
        } else {
            System.out.println("Não encontrado");
        }
        console.close();
    }
}
