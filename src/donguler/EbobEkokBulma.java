package donguler;

import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi girin: ");
        int number1 = input.nextInt();
        System.out.print("Ikinci sayiyi girin: ");
        int number2 = input.nextInt();

        int i = 1, ebob = 1, ekok=1;
        while (i <= number1) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (number1 * number2) / ebob;
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);

        input.close();
    }
}
