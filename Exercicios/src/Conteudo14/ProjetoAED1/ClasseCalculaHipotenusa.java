package Conteudo14.ProjetoAED1;

public class ClasseCalculaHipotenusa {
    public static void CalcHipotenusa() {
        double hipotenusa, cateto1, cateto2;
        System.out.print("Informe o valor do cateto 1: ");
        cateto1 = Menu1.console.nextDouble();
        System.out.print("Informe o valor do cateto 2 : ");
        cateto2 = Menu1.console.nextDouble();
        hipotenusa = Math.pow(Math.pow(cateto1, 2) + Math.pow(cateto2, 2), 1.0 / 2);
        System.out.print("Hipotenusa = " + hipotenusa);
        Menu1.console.close();
    }
}
