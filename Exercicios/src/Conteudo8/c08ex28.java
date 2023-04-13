package Conteudo8;

public class c08ex28 {
    // 1*2*3 = 6 / 2*3*4 = 24 / 3*4*5 = 60
    public static void main(String[] args) {
        int numeroT = 1;
        double soma = 0, media;
        for (int i = 1; numeroT <= 720; i++) {
            numeroT = i * (i + 1) * (i + 2);
            soma += numeroT;
            System.out.println(numeroT);
        }
        media = soma / 9;
        System.out.println("A média é " + media);
    }
}
