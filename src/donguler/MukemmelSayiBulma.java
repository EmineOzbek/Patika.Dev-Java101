package donguler;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int number = input.nextInt();

        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                total += i;
        }
        if (total == number)
            System.out.println(number + " sayisi mukemmel sayidir.");
        else
            System.out.println(number + " sayisi mukemmel sayi degildir.");

        input.close();
    }
}
