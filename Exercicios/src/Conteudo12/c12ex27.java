package Conteudo12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c12ex27 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<String> CPF = new ArrayList<String>();
        List<String> endereco = new ArrayList<String>();
        String cpfTemp, enderecoTemp;
        int pos = -1, indice;
        do {
            System.out.print("Digite o seu CPF(com pontos e traços e digite X para para parar a listagem): ");
            cpfTemp = console.nextLine();
            if (cpfTemp.equalsIgnoreCase("X")) {
                break;
            } else {
                CPF.add(cpfTemp);
                System.out.print("Digite o seu Endereço: ");
                enderecoTemp = console.nextLine();
                endereco.add(enderecoTemp);
            }
        } while (!cpfTemp.equalsIgnoreCase("X"));

        System.out.println();
        System.out.print("Digite um CPF para ser pesquisado: ");
        cpfTemp = console.nextLine();

        for (int i = 0; i < CPF.size(); i++) {
            if (CPF.get(i).equalsIgnoreCase(cpfTemp)) {
                pos = i;
            }
        }

        if (pos >= 0) {
            System.out.println("CPF encontrado");
            System.out.println(
                    "Se deseja alterar o endereço, digite: 'alterar', se deseja remover o CPF/Endereço digite: 'remover' e se deseja imprimir a lista digite: 'imprimir'.");
            enderecoTemp = console.nextLine();

            switch (enderecoTemp) {
                case "alterar" -> {
                    System.out.print("Digite o novo endereço: ");
                    enderecoTemp = console.nextLine();

                    indice = CPF.indexOf(cpfTemp);
                    endereco.set(indice, enderecoTemp);
                }
                case "remover" -> {
                    indice = CPF.indexOf(cpfTemp);
                    CPF.remove(indice);
                    endereco.remove(indice);
                }
                case "imprimir" -> {

                }
                default -> {
                    System.out.println("Você digitou errado");
                }
            }
            for (int i = 0; i < CPF.size(); i++) {
                System.out.print(CPF.get(i));
                System.out.print(" - ");
                System.out.print(endereco.get(i));
                System.out.print(", ");
            }

        } else {
            System.out.println("CPF não encontrado");
            System.out.println("Se desejar adicionar um novo endereço digite: 'incluir', se não digite 'imprimir'.");
            enderecoTemp = console.nextLine();

            switch (enderecoTemp) {
                case "incluir" -> {
                    System.out.print("Digite o novo CPF a ser registrado: ");
                    cpfTemp = console.nextLine();
                    System.out.print("Digite o novo Endereço a ser inserido: ");
                    enderecoTemp = console.nextLine();

                    CPF.add(cpfTemp);
                    endereco.add(enderecoTemp);

                    for (int i = 0; i < CPF.size(); i++) {
                        System.out.print(CPF.get(i));
                        System.out.print(" - ");
                        System.out.print(endereco.get(i));
                        System.out.print(", ");
                    }

                }
                case "imprimir" -> {
                    for (int i = 0; i < CPF.size(); i++) {
                        System.out.print(CPF.get(i));
                        System.out.print(" - ");
                        System.out.print(endereco.get(i));
                        System.out.print(", ");
                    }
                }
            }
        }

        console.close();
    }
}
