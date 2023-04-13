package Conteudo8;

public class c08ex27 {
    public static void main(String[] args) {
        for(int i = 1; i<= 10; i++) {
            for(int a = 1; a <= 8 ; a++) {
                for(int j = 1; j <= Math.pow(2, a - 1); j++) {
                    System.out.print("*");
                }
                    System.out.println();
            }
            for(int b = 7; b >= 1 ; b--) {
                for(int j = 1; j <= Math.pow(2, b - 1); j++) {
                    System.out.print("*");
                }
                    System.out.println();
            }
        }
    }
}
