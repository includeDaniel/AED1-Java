package Conteudo4;

import java.util.Scanner;

public class c04ex02 {
    // Ficha Funcional
    public static void main(String[] args) {
        String nome, cpf, identidade, nomeEmpresa;
        long tituloEleitor, carteiraMotorista;
        double salario;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite o seu CPF: ");
        cpf = teclado.nextLine();
        System.out.print("Digite a sua identidade: ");
        identidade = teclado.nextLine();
        System.out.print("Digite o seu titulo de eleitor: ");
        tituloEleitor = teclado.nextLong();
        System.out.print("Digite a sua carteira de motorista: ");
        carteiraMotorista = teclado.nextLong();
        System.out.print("Digite o seu salario: ");
        salario = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Digite o nome da sua empresa: ");
        nomeEmpresa = teclado.nextLine();
        System.out.println();
        System.out.println();
        System.out.print("FICHA FUNCIONAL DE: " + nome);
        System.out.println();
        System.out.println();
        System.out.println("Documentos: ");
        System.out.println("CPF ..................................... " + cpf);
        System.out.println("C.I. .................................... " + identidade);
        System.out.println("Titulo de eleitor ....................... " + tituloEleitor);
        System.out.println("Carteira de motorista ................... " + carteiraMotorista);
        System.out.println();
        System.out.println("Empresa: " + nomeEmpresa);
        System.out.println("Salario: R$" + salario);
        System.out.println();
        System.out.println();
        teclado.close();
    }
}
