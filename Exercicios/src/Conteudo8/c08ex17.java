package Conteudo8;

public class c08ex17 {
    public static void main(String[] args) {
      double resultado;
      for(int i = 3; i <= 12; i++) {
        resultado = Math.sqrt(Math.pow(i, 2) - 3);
        System.out.print("\nPara x = " + i + "f(x) = ");
        System.out.printf("%.4f",resultado);
      }  
    }
}
