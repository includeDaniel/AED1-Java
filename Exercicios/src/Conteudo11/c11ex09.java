package Conteudo11;

import java.util.Scanner;

public class c11ex09 {
    public static void main(String[] args) {
        String funcionario, setor = "", setorComMaisFuncionarios = "", funcionarioAntigo = "", funcionarioNovo = "";
        int RF, ano, codigo, admissao, cont = 0, contG = 0, contAd = 0, contOb = 0, contP = 0, menorAno = 15,
                menorAdmissao = 1000, maiorAno = 0, maiorAdmissao = 0;
        Scanner console = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("Digite o nome do funcionário:(Digite 'Fim' para cancelar a recepção) ");
            funcionario = console.nextLine();
            if (funcionario.equalsIgnoreCase("FIM")) {

            } else {
                System.out.println(
                        "Digite o registro funcional:(6 digitos / 2 primeiros digitos o ano admitido / terceiro digito código / ultimos 3 digitos ordem de admissão) ");
                RF = console.nextInt();
                console.nextLine();

                ano = RF / 10000;
                codigo = (RF / 1000) % 10;
                admissao = RF % 1000;

                // 100000
                if (RF < 100000 || RF > 999999) {
                    System.out.println("Registro inválido(Registro com menos ou mais de 6 digitos)");
                } else if (ano < 10 || ano > 14) {
                    System.out.println("Registro inválido(Ano inválido)");
                } else {

                    switch (codigo) {
                        case 1 -> {
                            setor = "Gerencia";
                            contG++;
                        }
                        case 2 -> {
                            setor = "Administracao";
                            contAd++;
                        }
                        case 3 -> {
                            setor = "Pesquisa";
                            contP++;
                        }
                        case 4 -> {
                            setor = "Obras";
                            contOb++;
                        }
                    }

                    if (ano == 10 && setor.equalsIgnoreCase("Administracao")) {
                        cont++;
                    }

                    if (ano < menorAno && admissao < menorAdmissao) {
                        menorAno = ano;
                        funcionarioAntigo = funcionario;
                        menorAdmissao = admissao;
                    }

                    if (ano > maiorAno && admissao > maiorAdmissao) {
                        maiorAno = ano;
                        funcionarioNovo = funcionario;
                        maiorAdmissao = admissao;
                    }
                }
            }
        } while (!funcionario.equalsIgnoreCase("FIM"));

        console.close();

        if (contG > contAd && contG > contP && contG > contOb) {
            setorComMaisFuncionarios = "Gerência";

        } else if (contAd > contG && contAd > contP && contAd > contOb) {
            setorComMaisFuncionarios = "Administração";

        } else if (contP > contG && contP > contAd && contP > contOb) {
            setorComMaisFuncionarios = "Pesquisa";

        } else {
            setorComMaisFuncionarios = "Obras";
        }

        System.out.println("Quantidade de pessoasa no setor 'Gerencia': " + contG);
        System.out.println("Quantidade de pessoasa no setor 'Administração': " + contAd);
        System.out.println("Quantidade de pessoasa no setor 'Pesquisa': " + contP);
        System.out.println("Quantidade de pessoasa no setor 'Obras': " + contOb);
        System.out.println(
                "A quantidade de pessoas que foram admitidas em 2010 e trabalham no setor de Administração é: " + cont);
        System.out.println("Setor com mais funcionários é: " + setorComMaisFuncionarios);
        System.out.println("Funcionário mais antigo: " + funcionarioAntigo);
        System.out.println("Funcionário mais novo " + funcionarioNovo);

    }
}
