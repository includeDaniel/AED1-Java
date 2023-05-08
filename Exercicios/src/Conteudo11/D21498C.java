//Daniel Nunes da Silva
package Conteudo11;

import java.util.Scanner;

public class D21498C {
    public static void main(String[] args) {
        String data, classificação, maiorClassificacao = "", dataMenorIndice = " ";
        double indice, somaIndice = 0, mediaIndiceTotal, indiceD = 0, mediaIndiceD = 0, menorIndice = 0;
        int contA = 0, contD = 0, contP = 0, contRep = 0;
        Scanner console = new Scanner(System.in);
        do {
            System.out.print("Digite a data: (Digite 'X' para parar o programa) ");
            data = console.nextLine();

            if(data.equalsIgnoreCase("X")) {

            } else {
                System.out.print("Digite o índice: (de 0 a 100) ");
                indice = console.nextDouble();
                console.nextLine();

                if(indice < 0 || indice > 100) {
                    do {
                        System.out.println();
                        System.out.println("O índice está menor que 0 ou maior que 100");
                        System.out.print("Digite o indice novamente: ");
                        indice = console.nextDouble();
                        console.nextLine();
                    } while (indice < 0 || indice > 100);
                }
            
                if(indice <= 35) {
                    classificação = "Agradável";
                    contA++;
                } else if (indice > 35 && indice <= 60) {
                    classificação = "Desagradável";
                    contD++;
                } else {
                    classificação = "Perigoso";
                    contP++;
                }

                somaIndice += indice;
                contRep++;

                if(classificação.equalsIgnoreCase("Desagradável")) {
                    indiceD += indice;
                }

                if( contRep == 1 || indice < menorIndice) {
                    menorIndice = indice;
                    dataMenorIndice = data;
                }

                System.out.println(classificação);
            }
        } while (!data.equalsIgnoreCase("X"));

        if(contA > contD && contA > contP) {
            maiorClassificacao = "Agradável";
        } else if(contD > contA && contD > contP) {
            maiorClassificacao = "Desagradável";
        } else {
            maiorClassificacao = "Perigoso";
        }

        mediaIndiceTotal = somaIndice / contRep;
        mediaIndiceD = indiceD / contD;
        System.out.println();
        System.out.println("A classificação mais registrada foi: " + maiorClassificacao);
        System.out.println("A média final dos índices de poluição foi: " + mediaIndiceTotal);
        System.out.println("A média dos índices de poluição da classificação desagradável é: " + mediaIndiceD);
        System.out.println("A última data em que foi registrado o menor índice de população foi: " + dataMenorIndice);



        console.close();
    }
}
