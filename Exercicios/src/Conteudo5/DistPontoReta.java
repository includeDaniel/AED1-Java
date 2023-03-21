package Conteudo5;

import javax.swing.JOptionPane;

public class DistPontoReta {
        public static void main(String[] args) {
                String termoAstr = JOptionPane.showInputDialog(null,
                                "Digite os valores de A: ",
                                "Distância entre ponto e reta",
                                JOptionPane.QUESTION_MESSAGE);
                String termoBstr = JOptionPane.showInputDialog(null,
                                "Digite os valores de B: ",
                                "Distância entre ponto e reta",
                                JOptionPane.QUESTION_MESSAGE);
                String termoCstr = JOptionPane.showInputDialog(null,
                                "Digite os valores de C: ",
                                "Distância entre ponto e reta",
                                JOptionPane.QUESTION_MESSAGE);
                String cordendaXstr = JOptionPane.showInputDialog(null,
                                "Digite as cordenadas de X: ",
                                "Distância entre ponto e reta",
                                JOptionPane.QUESTION_MESSAGE);
                String cordenadaYstr = JOptionPane.showInputDialog(null,
                                "Digite as cordenadas de Y: ",
                                "Distância entre ponto e reta",
                                JOptionPane.QUESTION_MESSAGE);

                double termoA = Double.valueOf(termoAstr);
                double termoB = Double.valueOf(termoBstr);
                double termoC = Double.valueOf(termoCstr);
                double cordenadaX = Double.valueOf(cordendaXstr);
                double cordenadaY = Double.valueOf(cordenadaYstr);

                double divisao = (Math.pow(termoA, 2) + Math.pow(termoB, 2));
                double distancia = (termoA * cordenadaX + termoB * cordenadaY + termoC) / Math.sqrt(divisao);

                JOptionPane.showMessageDialog(null,
                                "A distância do ponto e da reta é de: " + distancia,
                                "Distância entre ponto e reta",
                                JOptionPane.INFORMATION_MESSAGE);
        }
}
