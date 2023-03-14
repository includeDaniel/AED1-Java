package Conteudo4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class c04ex05 {
    public static void main(String[] args) {
        Scanner ficha = new Scanner(c04ex05.class.getResourceAsStream("ficha.txt"));
        String nome = ficha.nextLine();
        String cpf = ficha.nextLine();
        String cI = ficha.nextLine();
        String tituloEleitor = ficha.nextLine();
        String carteriaMotorista = ficha.nextLine();
        String empresa = ficha.nextLine();
        String salario = ficha.nextLine();

        JOptionPane.showMessageDialog(null, "FICHA FUNCIONAL DE:  " + nome + "\n\n"
                + "Documentos:\n\n" + "CPF............................................... " + cpf
                + "\nC.I. ................................................ " + cI
                + "\nTítulo de eleitor .......................... " + tituloEleitor
                + "\nCarteira de motorista ................. " + carteriaMotorista
                + "\n\nEmpresa: " + empresa + "\nSalario: R$" + salario, "Ficha", JOptionPane.INFORMATION_MESSAGE);
    }
}
