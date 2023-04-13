package Conteudo8;

public class c08ex26 {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 10; i++) {
            for(int a = 1; a <= 10; a++) {
                for(int j = 1; j<= a; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for(int a = 10; a >= 1; a--) {
                for(int j = 1; j<= a; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }

        

    }
}
