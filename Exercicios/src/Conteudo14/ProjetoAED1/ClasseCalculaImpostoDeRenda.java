package Conteudo14.ProjetoAED1;

import javax.swing.JOptionPane;

public class ClasseCalculaImpostoDeRenda {
    public static void CalcImpostoDeRenda() {
        String salarioStr, numeroDependetensStr;
        double liquido;

        salarioStr = JOptionPane.showInputDialog(null,
                "Digite seu salário: ",
                "Imposto de renda", JOptionPane.QUESTION_MESSAGE);
        numeroDependetensStr = JOptionPane.showInputDialog(null,
                "Digite o numero de dependentes: ",
                JOptionPane.QUESTION_MESSAGE);

        double salario = Double.valueOf(salarioStr);
        int numeroDependentes = Integer.valueOf(numeroDependetensStr);

        liquido = salario - (numeroDependentes * 60.0);
        double impostoRenda = liquido * 15 / 100;

        JOptionPane.showMessageDialog(null,
                "Imposto de renda: " + impostoRenda);
    }
}
