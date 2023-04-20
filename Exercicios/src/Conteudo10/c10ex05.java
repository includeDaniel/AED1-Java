package Conteudo10;

import java.util.Scanner;

public class c10ex05 {
    public static void main(String[] args) {
        double altura, peso, media = 0, soma = 0;
        String sexo;
        int cont = 0, contHomem = 0, contMulher = 0, contPesoMulher = 0;
        Scanner console = new Scanner(System.in);

        do {
            System.out.print("\nDigite a altura do funcionário: ");
            altura = console.nextDouble();

            if (altura == 0) {

            } else {
                cont++;
                System.out.print("Digite o peso do funcionário: ");
                peso = console.nextDouble();
                console.nextLine();
                System.out.print("Digite o sexo do funcionário ( M ou F ): ");
                sexo = console.nextLine();
                do {
                    if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")) {
                        System.out.print("Digitação inválida, digite o sexo novamente: ");
                        sexo = console.nextLine();
                    }
                } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"));

                if (sexo.equalsIgnoreCase("M")) {
                    contHomem++;
                    soma += altura;
                } else {
                    if (peso > 60) {
                        contPesoMulher++;
                    }
                    contMulher++;
                }
            }

        } while (altura != 0);
        media = (float) soma / contHomem;
        System.out.println("Quantidade de pessoas pesquisadas: " + cont);
        System.out.println("Quantidade de mulheres: " + contMulher);
        System.out.println("Altura media dos homens: " + media);
        System.out.println("Quantidade de mulheres com peso maior que 60kg: " + contPesoMulher);
        console.close();
    }
}
