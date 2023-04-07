package Conteudo8;

import javax.swing.JOptionPane;

public class c08ex11 {
        public static void main(String[] args) {
                String nome, maiorSalarioNome = "", idade, salario;

                int sexo, estadoCivil, corDosOlhos, corDosCabelos, escolaridade, contador1 = 0, maiorSalario = 0,
                                menorSalario = 0, menorSalarioH = 0, maiorSalarioH = 0;
                double difSalario;

                String[] opSexo = { "M", "F" };
                String[] opEstadoCivil = { "C", "S", "O" };
                String[] opCorDosOlhos = { "A", "C", "P", "O" };
                String[] opCorDosCabelos = { "L", "P", "C", "R" };
                String[] opEscolaridade = { "1", "2", "3", "4" };

                for (int i = 1; i <= 3; i++) {
                        nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Questionário",
                                        JOptionPane.INFORMATION_MESSAGE);

                        idade = JOptionPane.showInputDialog(null, "Digite a sua idade: ", "Questionário",
                                        JOptionPane.INFORMATION_MESSAGE);

                        sexo = JOptionPane.showOptionDialog(null, "Seu sexo: ",
                                        "Questionário",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opSexo,
                                        opSexo[0]);

                        estadoCivil = JOptionPane.showOptionDialog(null, "Seu estado civil: ",
                                        "Questionário",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                                        opEstadoCivil, opEstadoCivil[0]);

                        corDosOlhos = JOptionPane.showOptionDialog(null, "A cor dos seus olhos: ",
                                        "Questionário",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                                        opCorDosOlhos, opCorDosOlhos[0]);

                        corDosCabelos = JOptionPane.showOptionDialog(null, "A cor dos seus cabelos: ",
                                        "Questionário",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                                        opCorDosCabelos,
                                        opCorDosCabelos[0]);

                        salario = JOptionPane.showInputDialog(null, "Digite o seu salário em R$: ", "Questionário",
                                        JOptionPane.INFORMATION_MESSAGE);

                        escolaridade = JOptionPane.showOptionDialog(null, "Nível de escolaridade: ",
                                        "Questionário",
                                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                                        opEscolaridade,
                                        opEscolaridade[0]);

                        int idadeInt = Integer.valueOf(idade);
                        int salarioInt = Integer.valueOf(salario);

                        if (sexo == 1 && corDosCabelos == 0 && corDosOlhos == 0 && idadeInt > 18 && idadeInt < 25
                                        && estadoCivil == 1 && salarioInt > 10000 && escolaridade == 3) {
                                contador1++;
                        }

                        if (salarioInt > maiorSalario) {
                                maiorSalario = salarioInt;
                                maiorSalarioNome = nome;
                        }

                        if (sexo == 0) {

                                if (i == 1 || salarioInt > maiorSalarioH) {
                                        maiorSalarioH = salarioInt;
                                }
                                if (i == 1 || salarioInt < menorSalarioH) {
                                        menorSalarioH = salarioInt;
                                }
                        }

                }
                difSalario = maiorSalarioH - menorSalarioH;
                System.out.print(
                                "\n\nQuantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salário maior que R$10.000,00 e curso superior completo: "
                                                + contador1);
                System.out.print("\n\nNome da pessoa com maior salário: " + maiorSalarioNome);
                System.out.print("\n\nDiferença entre o maior salário dos homens: R$" + difSalario);

        }
}