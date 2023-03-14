package Conteudo5;

import javax.swing.JOptionPane;

public class c05ex02 {
    public static void main(String[] args) {
        String pegaRaioStr = JOptionPane.showInputDialog(null, "INFORME O VALOR DO RAIO: ",
                "CALCULADOR DE AREA E VOLUME ESFERICO",
                JOptionPane.INFORMATION_MESSAGE);
        double pegaRaioDouble = Double.valueOf(pegaRaioStr);
        double area = 4 * 3.1416 * Math.pow(pegaRaioDouble, 2);
        double volume = 4 * 3.1416 * Math.pow(pegaRaioDouble, 3) / 3;

        JOptionPane.showMessageDialog(null, "Raio: " + pegaRaioDouble + "\nÁrea: " + area + "\nVolume: " + volume,
                pegaRaioStr,
                0);
    }
}
