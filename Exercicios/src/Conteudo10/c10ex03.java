package Conteudo10;

import java.util.Scanner;

public class c10ex03 {
    public static void main(String[] args) {
        double angulo, raio, resultado;
        Scanner console = new Scanner(System.in);
        System.out.println("Digite o valor do angulo: ");
        angulo = console.nextDouble();
        do {
            System.out.println("Digite o valor do raio: ");
            raio = console.nextDouble();
            if(raio == -1) {

            } else {
                resultado = (angulo * 3.1416 * Math.pow(raio, 2)) / 360.0;
                System.out.println(resultado);
            }
        } while ( raio != -1);
        
        
        
        
        console.close();
    }
}
