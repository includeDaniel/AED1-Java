package Conteudo8;

public class c08ex24 {
    public static void main(String[] args) {
        double n = 1, soma = 0, serie;
        for(int i = 1; i<= 99; i+=2) {
            n = Math.pow(2, i);
            soma += n;
        }
        serie = (1/3.0) * (soma);
        System.out.println(serie);
    }
}
