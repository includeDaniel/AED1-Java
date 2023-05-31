package Conteudo13;

import java.util.Scanner;

public class c13ex01Extra {
    public static void main(String[] args) {
        Imprime();
    }

    public static void Imprime() {
        Scanner console = new Scanner(System.in);
        double salario, imposto;
        int dependentes;
        System.out.print("Digite o seu salário: ");
        salario = console.nextDouble();
        System.out.print("Quantidade de dependentes: ");
        dependentes = console.nextInt();
        imposto = CalculaImposto(salario, dependentes);
        System.out.println(imposto);
        console.close();
    }

    public static double CalculaImposto(double salario, int dependentes) {
        double imposto;

        if (salario <= 1000) {
            imposto = 0;
        } else if (salario > 1000 && salario <= 5000) {
            imposto = (salario - (dependentes * 150)) * (10.0 / 100);
        } else if (salario > 5000 && salario <= 10000) {
            imposto = (salario - (dependentes * 150)) * (15.0 / 100);
        } else {
            imposto = (salario - (dependentes * 150)) * (20.0 / 100);
        }

        return imposto;
    }
}
