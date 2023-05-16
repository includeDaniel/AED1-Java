package Conteudo12;

import java.util.Scanner;

public class c12ex25 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String time[] = new String[20], tempTime, timePesquisado, situacao;
        int pontuacaoF[] = new int[20], tempPontuacaoF, pos;

        for(int i = 0 ; i < time.length; i++) {
            System.out.print("Digite o nome do time: ");
            time[i] = console.nextLine();
            System.out.print("Digite o a pontuacão final do time: ");
            pontuacaoF[i] = console.nextInt();
            console.nextLine();
            System.out.println();
        }
      

        for(int i = 0; i < time.length - 1; i++) {
            for(int j = 0; j < time.length - 1; j++) {
                if(pontuacaoF[j] < pontuacaoF[j + 1]) {
                    tempTime = time[j + 1];
                    time[j + 1] = time[j];
                    time[j] = tempTime;
                    tempPontuacaoF = pontuacaoF[j + 1];
                    pontuacaoF[j + 1] = pontuacaoF[j];
                    pontuacaoF[j] = tempPontuacaoF;
                }
            }
        }
        System.out.println("Digite o nome do time para pesquisar sua posicao na tabela: ");
        timePesquisado = console.nextLine();

        console.close();

        for(int i = 0; i < time.length; i++) {
            pos = (i + 1);
            if(time[i].equalsIgnoreCase(timePesquisado)) {
                System.out.println("A posição do time na tabela é: " + pos);
                if(pos >= 1 && pos <= 4) {
                    situacao = "Copa Libertadores";
                } else if(pos >= 5 && pos <= 12){
                    situacao = "Copa Sul-Americana";
                } else if(pos >= 13 && pos <= 16) {
                    situacao = "Não Rebaixada";
                } else {
                    situacao = "Rebaixada";
                }
                System.out.println("E a sua situação é: " + situacao);
            }
        }
    }
}
