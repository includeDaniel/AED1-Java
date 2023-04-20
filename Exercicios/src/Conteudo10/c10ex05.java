package Conteudo10;

import java.util.Scanner;

public class c10ex05 {
    public static void main(String[] args) {
        double altura, peso;
        String sexo;
        Scanner console = new Scanner(System.in);

        do {    
            System.out.print("Digite a altura do funcionário: ");
            altura = console.nextDouble();

            if( altura == 0) {

            } else {
                System.out.print("Digite o peso do funcionário: ");
                peso = console.nextDouble();
                System.out.print("Digite o sexo do funcionário ( M ou F ): ");
                sexo = console.nextLine();
                do {
                    if(!sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
                        System.out.print("Digitação inválida, digite o sexo novamente: ");
                        sexo = console.nextLine();
                    } 
                } while(!sexo.equalsIgnoreCase("M") || !sexo.equalsIgnoreCase("F"));

            }

        } while( altura != 0);

        console.close();
    }
}
