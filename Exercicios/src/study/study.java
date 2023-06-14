package study;

import java.util.Scanner;

public class study {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double salario;
        int dependentes;

        System.out.print("Digite o seu salário: ");
        salario = console.nextDouble();
        System.out.print("Digite o número de dependetes: ");
        dependentes = console.nextInt();

        System.out.println(IRPF(salario, dependentes));

        console.close();
    }

    public static double IRPF(double salario, int dependentes) {
        double aliquota, ImpostoDeRenda;
        if (salario <= 1000) {
            aliquota = 0;
        } else if (salario > 1000 && salario <= 5000) {
            aliquota = 0.1;
        } else if (salario > 5000 & salario <= 10000) {
            aliquota = 0.15;
        } else {
            aliquota = 0.2;
        }
        ImpostoDeRenda = (salario - dependentes * 150) * aliquota;
        return ImpostoDeRenda;
    }
}
