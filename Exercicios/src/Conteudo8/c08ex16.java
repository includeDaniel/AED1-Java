package Conteudo8;

public class c08ex16 {
    public static void main(String[] args) {
        int soma = 0, cont = 0;
        double media;
      for(int i = 1000; i <= 2000; i++)  {
        cont++;
        soma += i;
      }
      media = soma / cont;
      System.out.print("A média dos números ímpares de 1000 até 2000 é: " + media);
    }
}
