package donguler;


import java.util.Random;
import java.util.Scanner;

public class HarmonikSayilariBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int number = input.nextInt();

        double result = 0.0;
        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println(result);

        input.close();
    }

}
