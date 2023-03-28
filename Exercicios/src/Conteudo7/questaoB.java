//Daniel Nunes da Silva
package Conteudo7;


import javax.swing.JOptionPane;

public class questaoB {
    public static void main(String[] args) {
        String c1, c2, c3, vencedor = "", votosC1, votosC2, votosC3, nulos, brancos;
        //int votosC1, votosC2, votosC3, nulos, brancos;
        c1 = JOptionPane.showInputDialog(null, "Digite o nome do primeiro candidato:", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
        System.out.print("Digite a quantidade de votos do primeiro candidato: ");
        votosC1 = JOptionPane.showInputDialog(null, "Digite o numero de votos do primeiro candidato:", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
        c2 =  JOptionPane.showInputDialog(null, "Digite o nome do segundo candidato: ", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
        votosC2 = JOptionPane.showInputDialog(null, "Digite a quantidade de votos do segundo candidato: ", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
        c3 = JOptionPane.showInputDialog(null, "Digite o nome do terceiro candidato: ", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
        votosC3 = JOptionPane.showInputDialog(null, "Digite a quantidade de votos do primeiro candidato: ", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
        brancos = JOptionPane.showInputDialog(null, "Digite a quantidade de votos em branco:", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);;
        nulos = JOptionPane.showInputDialog(null, "Digite a quantidade de votos nulos:", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);

        int votosC1Int = Integer.valueOf(votosC1);
        int votosC2Int = Integer.valueOf(votosC2);
        int votosC3Int = Integer.valueOf(votosC3);
        int brancosInt = Integer.valueOf(brancos);
        int nulosInt = Integer.valueOf(nulos);

        if( votosC1Int + votosC2Int + votosC3Int > nulosInt + brancosInt ) {
            if(votosC1Int > votosC2Int && votosC1Int > votosC3Int) {
                vencedor = c1;
                JOptionPane.showMessageDialog(null,"O vencedor é " + vencedor + ".", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
            } else if (votosC2Int > votosC1Int && votosC2Int > votosC3Int) {
                vencedor = c2;
                JOptionPane.showMessageDialog(null,"O vencedor é " + vencedor + ".", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
            } else {
                vencedor = c3;
                JOptionPane.showMessageDialog(null,"O vencedor é " + vencedor + ".", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Eleição Inválida", "QuestaoB", JOptionPane.INFORMATION_MESSAGE);
        }

      


    }
}
