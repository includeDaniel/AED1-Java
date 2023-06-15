package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class study2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<String> Nomes = new ArrayList<String>();
        List<Double> IRPF = new ArrayList<Double>();
        String nome, nomeTemp;
        double salario, IRPFTemp;
        int dependentes;

        do {
            System.out.println("Digite o nome do funcionário (Digite 'Parar' para parar): ");
            nome = console.nextLine();
            if (nome.equalsIgnoreCase("Parar")) {

            } else {
                System.out.println("Salário do funcionário: ");
                salario = console.nextDouble();
                System.out.println("Dependentes do funcionário: ");
                dependentes = console.nextInt();
                console.nextLine();

                Nomes.add(nome);
                IRPFTemp = study.IRPF(salario, dependentes);
                IRPF.add(IRPFTemp);
                console.close();
            }
        } while (!nome.equalsIgnoreCase("Parar"));

        for (int i = 0; i < Nomes.size() - 1; i++) {
            for (int j = 0; j < Nomes.size() - 1; j++) {
                if (Nomes.get(j).compareToIgnoreCase(Nomes.get(j + 1)) > 0) {
                    nomeTemp = Nomes.get(j);
                    Nomes.set(j, Nomes.get(j + 1));
                    Nomes.set(j + 1, nomeTemp);

                    IRPFTemp = IRPF.get(j);
                    IRPF.set(j, IRPF.get(j + 1));
                    IRPF.set((j + 1), IRPFTemp);
                }
            }
        }

        for (int i = 0; i < Nomes.size(); i++) {
            System.out.print(Nomes.get(i) + ", ");
            System.out.print(IRPF.get(i) + " ");

        }

    }

}
