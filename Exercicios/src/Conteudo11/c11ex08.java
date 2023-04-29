package Conteudo11;

import java.util.Scanner;

public class c11ex08 {
    public static void main(String[] args) {
        String trabalhador, funcao, maiorTrabalhador = "", funcaoMaior = "";
        double horaValor, horas, horasTotal = 0, pagamento, premio = 0, media = 0, maiorPagamento = 0,
                pagamentoTotal = 0;
        int acima500, cont = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        Scanner console = new Scanner(System.in);

        System.out.print("Digite o número da hora trabalhada no projeto: ");
        horaValor = console.nextDouble();
        console.nextLine();
        System.out.print("Digite o nome do trabalhador: (FIM para parar a repetição) ");
        trabalhador = console.nextLine();
        while (!trabalhador.equalsIgnoreCase("FIM")) {
            System.out.print("Digite a função do trabalhador: ");
            funcao = console.nextLine();
            System.out.print("Digite a quantidade de horas trabalhadas: ");
            horas = console.nextDouble();
            console.nextLine();

            cont++;

            if (horas <= 100) {
                premio = 1000;
                pagamento = horaValor * horas + premio;
                cont2++;
            } else if (horas > 100 && horas <= 500) {
                premio = 10;
                pagamento = horaValor * horas + (horas * premio);
                cont3++;
            } else {
                acima500 = (int) horas / 10;
                acima500 = acima500 * 100;
                pagamento = horaValor * horas + acima500;
                cont4++;
            }

            System.out.println("o trabalhador receberá: " + pagamento);

            horasTotal += horas;

            if (pagamento >= maiorPagamento) {
                maiorPagamento = pagamento;
                maiorTrabalhador = trabalhador;
                funcaoMaior = funcao;
            }

            pagamentoTotal += pagamento;

            System.out.print("Digite o nome do trabalhador: (FIM para parar a repetição) ");
            trabalhador = console.nextLine();
        }
        media = (float) horasTotal / cont;
        System.out.println();
        System.out.println("Media de horas por trabalhador é: " + media);
        System.out.println(
                "Trabalhador a receber o maior salário é: " + maiorTrabalhador + " e tem a função de: " + funcaoMaior);
        System.out.println("até 100 " + cont2);
        System.out.println("acima de 100 até 500 " + cont3);
        System.out.println("acima de 500 " + cont3);
        System.out.println("O valor total da folha de pagamento é: " + pagamentoTotal);
        console.close();
    }
}
