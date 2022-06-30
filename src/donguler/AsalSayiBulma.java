package donguler;

import java.util.Scanner;

public class AsalSayiBulma {

    public static void main(String[] args) {

        int number = 2;
        while (number <= 100) {

            int counter = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    counter++;
            }
            if (counter < 1 || number == 2)
                System.out.println(number);

            number++;
        }
    }
}
