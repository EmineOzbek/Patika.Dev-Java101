package donguler;

import java.util.Scanner;

public class TersUcgenYapma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisi girin: ");
        int number = input.nextInt();

        //basamak sayisi
        for (int i = 1; i <= number; i++) {
            //her satir icin yildizdan onceki bosluk sayisi
            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i) - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        input.close();
    }
}
