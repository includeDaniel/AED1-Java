package Conteudo13;

public class c13ex02Method {
    public static double CalculaExpressao(double x) {
        double resultado = 0;
        if (x < 4) {
            return resultado = (5.0 * x + 3.0) / Math.sqrt((16.0 - (Math.pow(x, 2.0))));
        } else if (x == 4) {
            return resultado;
        } else {
            return resultado = (5.0 * x + 3.0) / (Math.sqrt((Math.pow(x, 2.0) - 16.0)));
        }
    }
}
