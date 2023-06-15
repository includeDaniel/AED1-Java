//Daniel Nunes da Silva

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D21498 {
    public static Scanner console = new Scanner(System.in);
    public static List<Integer> codigo = new ArrayList<Integer>();
    public static List<Double> valor = new ArrayList<Double>();
    static int codigoTemp;
    static double valorTemp;
    static String data_base;

    public static void main(String[] args) {
        int opcao = 1;
        System.out.println("Informe a data base: ");
        data_base = console.nextLine();

        do {
            if (opcao == 0) {

            } else {
                System.out.println();
                System.out.println("0- para sair do programa");
                System.out.println("1- Inclusao de Bens: ");
                System.out.println("2- Exclusao de Bens: ");
                System.out.println("3- Atualização de Bens: ");
                System.out.println("4- Pesquisa de Bem: ");
                System.out.println("5- Listagem de Bens: ");
                System.out.println();
                opcao = console.nextInt();
                System.out.println();

                switch (opcao) {
                    case 1 -> {
                        inclusaoDeBens();
                    }
                    case 2 -> {
                        exclusaoDeBens();
                    }
                    case 3 -> {
                        atualizacaoDeBens();
                    }
                    case 4 -> {
                        PesquisaBem();
                    }
                    case 5 -> {
                        ListagemDeBens();
                    }
                }
            }
        } while (opcao != 0);
    }

    public static void inclusaoDeBens() {

        do {
            System.out.print("Digite o código do bem: (para parar de cadastrar digite '-1') ");
            codigoTemp = console.nextInt();
            console.nextLine();
            if (codigoTemp == -1) {

            } else {
                if (codigo.indexOf(codigoTemp) < 0) {
                    codigo.add(codigoTemp);

                    System.out.print("Digite o valor do bem: ");
                    valorTemp = console.nextDouble();
                    valor.add(valorTemp);

                    System.out.println("BEM CADASTRADO");
                } else {
                    System.out.println("BEM JÁ CADASTRADO");
                }
            }
        } while (codigoTemp != -1);
    }

    public static void exclusaoDeBens() {
        System.out.println("Digite o código do bem: ");
        codigoTemp = console.nextInt();
        if (codigo.indexOf(codigoTemp) >= 0) {
            System.out.println("valor do bem: " + valor.get(codigo.indexOf(codigoTemp)));
            System.out.println("data base: " + data_base);
            System.out.println("BEM EXCLUÍDO");
            codigo.remove(codigo.indexOf(codigoTemp));
            valor.remove(codigo.indexOf(codigoTemp));
        } else {
            System.out.println("Bem não encontrado");
        }
    }

    public static void atualizacaoDeBens() {
        System.out.println("Digite o código do bem: ");
        codigoTemp = console.nextInt();
        if (codigo.indexOf(codigoTemp) >= 0) {
            System.out.println("Digite o novo valor: ");
            valorTemp = console.nextDouble();
            valor.set(codigo.indexOf(codigoTemp), valorTemp);
            System.out.println("BEM ATUALIZADO");
        } else {
            System.out.println("BEM NÃO ENCONTRADO");
        }
    }

    public static void PesquisaBem() {
        System.out.println("Digite o código do bem: ");
        codigoTemp = console.nextInt();
        if (codigo.indexOf(codigoTemp) >= 0) {
            System.out.println("BEM ENCONTRADO");
            System.out.println("Valor do bem: " + valor.get(codigo.indexOf(codigoTemp)));
            System.out.println("Data base: " + data_base);
        } else {
            System.out.println("BEM NÃO ENCONTRADO");
        }
    }

    public static void ListagemDeBens() {
        double valorTotalPatrimonio = 0;
        for (int i = 0; i < codigo.size() - 1; i++) {
            for (int j = 0; j < codigo.size() - 1; j++) {
                if (valor.get(j) < (valor.get(j + 1))) {
                    codigoTemp = codigo.get(j);
                    codigo.set(j, codigo.get(j + 1));
                    codigo.set(j + 1, codigoTemp);

                    valorTemp = valor.get(j);
                    valor.set(j, valor.get(j + 1));
                    valor.set((j + 1), valorTemp);
                }
            }
        }
        for (int aux = 0; aux < codigo.size(); aux++) {
            System.out.println("Codigo: " + codigo.get(aux) + ", ");
            System.out.println("Valor: " + valor.get(aux) + ", ");
            System.out.println("Data base: " + data_base);
            System.out.println();
        }
        System.out.println("A quantidade de bens listados é: " + codigo.size());

        for (int i = 0; i < valor.size(); i++) {
            valorTotalPatrimonio += valor.get(i);
        }

        System.out.println("Valor total do patrimônio: " + valorTotalPatrimonio + " Reais");
    }
}
