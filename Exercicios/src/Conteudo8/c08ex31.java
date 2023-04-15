package Conteudo8;

import java.util.Scanner;

public class c08ex31 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rep, cont = 0, contAd = 0, contOut = 0;
        double salario, salarioMin = 0, somaSalario = 0, media = 0, salarioMinTotal = 0;
        String nome, codigo, cargo = "", nomeSalarioMin = "", cargoSalarioMin = "";
        System.out.print("Digite a quantidade de engenheiros: ");
        rep = console.nextInt();
        console.nextLine();
        for (int i = 1; i <= rep; i++) {
            System.out.print("Digite o nome do engenheiro: ");
            nome = console.nextLine();
            System.out.print("Digite o salário bruto: ");
            salario = console.nextDouble();
            console.nextLine();
            System.out.println("Digite o código: ");
            codigo = console.nextLine();

            switch (codigo) {
                case "C" -> {
                    cargo = "Engenheiro Calculista";
                    salarioMin = 2500;
                }
                case "P" -> {
                    cargo = "Engenheiro Projetista";
                    salarioMin = 4650;
                }
                case "O" -> {
                    cargo = "Engenheiro de Obra";
                    salarioMin = 3200;
                }
                case "A" -> {
                    cargo = "Engenheiro Administrador";
                    salarioMin = 5100;
                }
                case "X" -> {
                    cargo = "Outros";
                    salarioMin = 0;
                }
            }
            if (i == 1 || salario < salarioMinTotal) {
                salarioMinTotal = salario;
                nomeSalarioMin = nome;
                cargoSalarioMin = cargo;
            }

            if (salario < salarioMin) {
                System.out.println("ABAIXO DO SALÁRIO MINÍMO \n");
            } else if (codigo.equalsIgnoreCase("X")) {

            } else {
                cont++;
            }
            if (codigo.equalsIgnoreCase("A")) {
                somaSalario += salario;
                contAd++;
            }
            if (codigo.equalsIgnoreCase("X") && salario > 5000) {
                contOut++;
            }
        }
        media = somaSalario / contAd;
        System.out.println("A quantidade de engenheiros com salário acima do mínimo: " + cont);
        System.out.printf("A média do salário dos Engenheiros Administradores é: %.2f", media);
        System.out.println("A quantidade e engenheiros do cargo 'Outros' acima de R$5.000,00: " + contOut);
        System.out.println("O menor salário é " + salarioMinTotal + " de " + nomeSalarioMin + " quem tem o cargo '"
                + cargoSalarioMin + "'");
        console.close();
    }
}
