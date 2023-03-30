package Conteudo8;

import javax.swing.JOptionPane;

public class c08ex09 {
        public static void main(String[] args) {
                int indice, repInt, idadeInt, soma1 = 0, soma2 = 0, M = 0, F = 0;
                String repStr, nome, idade;
                String[] botoes = { "M", "F" };
                double mediaF, mediaM;

                repStr = JOptionPane.showInputDialog(null, "Digite o número de pessoas",
                                "Digite", JOptionPane.QUESTION_MESSAGE);
                repInt = Integer.valueOf(repStr);
                for (int i = 1; i <= repInt; i++) {
                        nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", "Digite",
                                        JOptionPane.QUESTION_MESSAGE);
                        idade = JOptionPane.showInputDialog(null, nome + " digite a sua idade: ", "Digite",
                                        JOptionPane.QUESTION_MESSAGE);
                        indice = JOptionPane.showOptionDialog(null, "Sexo: ", "Clique em um botão",
                                        JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoes,
                                        "M");
                        idadeInt = Integer.valueOf(idade);
                        if (indice == 0) {
                                soma1 += idadeInt;
                                M++;
                        } else {
                                soma2 += idadeInt;
                                F++;
                        }
                }
                mediaM = (float) soma1 / M;
                mediaF = (float) soma2 / F;

                JOptionPane.showMessageDialog(null, "Média das idades dos homens " + mediaM,
                                "Média Homens", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Média das idades das mulheres " + mediaF,
                                "Média Mulheres", JOptionPane.INFORMATION_MESSAGE);

        }
}
