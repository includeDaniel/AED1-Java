import java.util.Scanner;

public class BubbleSortArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String arr[] = new String[3];
        String arrTemp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Preencha: ");
            arr[i] = console.nextLine();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    arrTemp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = arrTemp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        console.close();
    }
}
