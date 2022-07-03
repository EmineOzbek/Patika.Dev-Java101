package donguler;

import java.util.Scanner;

public class FibonacciSerisi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayisini girin:");
        int number = input.nextInt();

        int n1 = 0, n2 = 1, result;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 1; i < number; i++) {
            result = n1 + n2;
            System.out.print(result + " ");
            n1 = n2;
            n2 = result;
        }

        input.close();
    }
}
