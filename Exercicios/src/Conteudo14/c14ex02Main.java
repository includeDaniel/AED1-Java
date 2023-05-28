package Conteudo14;

import java.util.Scanner;

public class c14ex02Main {
    public static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int codigo;
        System.out.println();
        System.out.println("1-Quadrado");
        System.out.println("2-Retângulo");
        System.out.println("3-Triângulo retângulo");
        System.out.println("4-Círculo");
        System.out.println();
        codigo = console.nextInt();

        switch (codigo) {
            case 1 -> {
                c14ex02Metodos.AreaQuadrado();
            }
            case 2 -> {
                c14ex02Metodos.AreaRetangulo();
            }
            case 3 -> {
                c14ex02Metodos.AreaTrianguloRetangulo();
            }
            case 4 -> {
                c14ex02Metodos.AreaCirculo();
            }
        }

    }
}
