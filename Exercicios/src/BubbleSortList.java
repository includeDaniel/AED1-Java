import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String nomeTemp;
        double salario = 0;
        List<String> nomesList = new ArrayList<String>();
        List<Double> salariosList = new ArrayList<Double>();

        do {
            System.out.println();
            System.out.print("Digite o nome do funcionário: (Digite 'Pare' para parar a repetição) ");
            nomeTemp = console.nextLine();
            if (nomeTemp.equalsIgnoreCase("Pare")) {

            } else {
                nomesList.add(nomeTemp);
                System.out.print("Digite o salário do funcionário: ");
                salario = console.nextDouble();
                console.nextLine();
                salariosList.add(salario);

            }
        } while (!nomeTemp.equalsIgnoreCase("Pare"));

        for (int i = 0; i < nomesList.size() - 1; i++) {
            for (int j = 0; j < nomesList.size() - 1; j++) {
                if (nomesList.get(j).compareToIgnoreCase(nomesList.get(j + 1)) > 0) {
                    nomeTemp = nomesList.get(j);
                    nomesList.set(j, nomesList.get(j + 1));
                    nomesList.set(j + 1, nomeTemp);

                    salario = salariosList.get(j);
                    salariosList.set(j, salariosList.get(j + 1));
                    salariosList.set((j + 1), salario);
                }
            }
        }
        System.out.println(nomesList);
        System.out.println(salariosList);
        console.close();
    }
}
