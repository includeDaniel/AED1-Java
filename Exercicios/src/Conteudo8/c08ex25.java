package Conteudo8;

public class c08ex25 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 10; i >= 1; i--) {
            for(int j = 1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
