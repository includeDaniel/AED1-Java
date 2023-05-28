package Conteudo14.ProjetoAED1;

public class ClasseVerificaPalindromo {
    public static void VerificaPalindromo() {
        System.out.print("Digite um número inteiro de 4 digitos: ");
        // 0000
        int numero = Menu1.console.nextInt();
        int primeiroNumero = numero / 1000;
        int segundoNumero = (numero % 1000) / 100;
        int terceiroNumero = (numero % 100) / 10;
        int quartoNumero = numero % 10;

        if (primeiroNumero + terceiroNumero == quartoNumero + segundoNumero && segundoNumero == terceiroNumero) {
            System.out.println("Este número é palíndromo");
        } else {
            System.out.println("Este número não é palíndromo");
        }
        Menu1.console.close();
    }
}
