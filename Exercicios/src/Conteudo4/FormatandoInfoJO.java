package Conteudo4;

import javax.swing.JOptionPane;

public class FormatandoInfoJO {
        // Formatando informações usando JOPTIONPANE
        public static void main(String[] args) {
                String primeiroNome = JOptionPane.showInputDialog(null,
                                "Qual o seu primeiro nome? ",
                                "Exercício 4",
                                JOptionPane.QUESTION_MESSAGE);
                String segundoNome = JOptionPane.showInputDialog(null,
                                "Qual o seu segundo nome? ",
                                "Exercício 4",
                                JOptionPane.QUESTION_MESSAGE);
                String sobrenome = JOptionPane.showInputDialog(null,
                                "Qual o seu sobrenome? ",
                                "Exercício 4",
                                JOptionPane.QUESTION_MESSAGE);
                String idadeStr = JOptionPane.showInputDialog(null,
                                "Qual a sua idade? ",
                                "Exercício 4",
                                JOptionPane.QUESTION_MESSAGE);

                int idade = Integer.valueOf(idadeStr);
                JOptionPane.showMessageDialog(null,
                                sobrenome + ", " + primeiroNome + " " + segundoNome +
                                                "\nIdade: " + idade,
                                idadeStr, JOptionPane.INFORMATION_MESSAGE);
        }
}
