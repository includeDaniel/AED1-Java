package Conteudo6;

import java.util.Scanner;

public class c06ex09 {
    public static void main(String[] args) {
        String sexo;
        String fem = "F", masc = "M";
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Digite F para feminino e M para masculino: ");
        sexo = teclado.nextLine();

        if (sexo.equalsIgnoreCase(fem)) {
            double pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("Peso ideal: %.3f", pesoIdeal);
        } else if (sexo.equalsIgnoreCase(masc)) {
            double pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Peso ideal: %.3f", pesoIdeal);
        } else {
            System.out.println("Reinicie o programa e digite 'M' ou 'F'");
        }
        teclado.close();
    }
}
