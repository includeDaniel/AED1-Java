package Conteudo14.ProjetoAED1;

import javax.swing.JOptionPane;

public class ClasseCalculaDistanciaEntrePontos {
    public static void CalcDistanciaEntrePontos() {
        String valorX1str = JOptionPane.showInputDialog(null,
                "Digite o valor de X1: ",
                "Calcula distância entre pontos",
                JOptionPane.QUESTION_MESSAGE);
        String valorY1str = JOptionPane.showInputDialog(null,
                "Digite o valor de Y1: ",
                "Calcula distância entre pontos",
                JOptionPane.QUESTION_MESSAGE);
        String valorX2str = JOptionPane.showInputDialog(null,
                "Digite o valor de X2: ",
                "Calcula distância entre pontos",
                JOptionPane.QUESTION_MESSAGE);
        String valorY2str = JOptionPane.showInputDialog(null,
                "Digite o valor de Y2: ",
                "Calcula distância entre pontos",
                JOptionPane.QUESTION_MESSAGE);
        double valorX1 = Double.valueOf(valorX1str);
        double valorX2 = Double.valueOf(valorX2str);
        double valorY1 = Double.valueOf(valorY1str);
        double valorY2 = Double.valueOf(valorY2str);

        double distancia = Math.sqrt(Math.pow(valorX1 - valorX2, 2) + Math.pow(valorY1 - valorY2, 2));

        JOptionPane.showMessageDialog(null, "Distancia: " + distancia,
                "Calcula distância entre pontos",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
