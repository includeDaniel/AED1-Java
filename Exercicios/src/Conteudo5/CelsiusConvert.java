package Conteudo5;

import java.util.Scanner;

public class CelsiusConvert {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        int celsius = temperatura.nextInt();
        int kelvin = celsius + 273;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.print("Celsius: " + celsius + "\nKelvin: " + kelvin + "\nFahrenheit: " + fahrenheit);
        temperatura.close();
    }
}