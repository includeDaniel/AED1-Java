package Conteudo5;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ValorX {
    public static void main(String[] args) {
        String xValueStr = JOptionPane.showInputDialog(null, "Informe o valor de X:",
                "Cálculo de x ", JOptionPane.INFORMATION_MESSAGE);
        double xValueDouble = Double.valueOf(xValueStr);
        double f = Math.pow(xValueDouble, 3) + 4 * xValueDouble + 10;
        String fFormatado = new DecimalFormat("#,##0.00").format(f);
        JOptionPane.showMessageDialog(null, "f(x) = " + fFormatado, "resultado", JOptionPane.INFORMATION_MESSAGE);

    }
};