package Conteudo11;

import java.util.Scanner;

public class c11ex06 {
    public static void main(String[] args) {
        int canal, numPessoas, cont = 0, cont2 = 0, cont3 = 0, numPessoas4 = 0, numPessoas7 = 0, numPessoas12 = 0,
                numPessoasTotal = 0, maiorNumPessoas = 0,
                canalMaisAssistido = 0;
        double porcentagem4 = 0, porcentagem7 = 0, porcentagem12 = 0, media = 0;
        Scanner console = new Scanner(System.in);

        for (int i = 1; i <= 78; i++) {
            System.out.print("Digite o número do canal: ");
            canal = console.nextInt();
            System.out.print("Digite o número de pessoas que estão assistindo: ");
            numPessoas = console.nextInt();

            switch (canal) {
                case 4 -> {
                    cont++;
                    numPessoas4 += numPessoas;
                }
                case 7 -> {
                    cont2++;
                    numPessoas7 += numPessoas;
                }
                case 12 -> {
                    cont3++;
                    numPessoas12 += numPessoas;
                }
            }

            if (numPessoas > maiorNumPessoas) {
                maiorNumPessoas = numPessoas;
                canalMaisAssistido = canal;
            }

            numPessoasTotal += numPessoas;
        }
        porcentagem4 = (numPessoas4 * 100.0) / numPessoasTotal;
        porcentagem7 = (numPessoas7 * 100.0) / numPessoasTotal;
        porcentagem12 = (numPessoas12 * 100.0) / numPessoasTotal;
        media = numPessoasTotal / 78.0;

        console.close();
        System.out.println();
        System.out.println("A audiência total do canal 4: " + numPessoas4);
        System.out.println("A audiência total do canal 7: " + numPessoas7);
        System.out.println("A audiência total do canal 12: " + numPessoas12);
        System.out.println("A porcentagem de audiência para o canal 4: " + porcentagem4);
        System.out.println("A porcentagem de audiência para o canal 7: " + porcentagem7);
        System.out.println("A porcentagem de audiência para o canal 12: " + porcentagem12);
        System.out.println("O canal mais assistido é: " + canalMaisAssistido);
        System.out.println("Média de pessoas assistindo: " + media);

    }
}
