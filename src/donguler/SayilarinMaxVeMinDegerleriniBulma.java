package donguler;


import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class SayilarinMaxVeMinDegerleriniBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kac adet sayi girilecek? ");
        int n = input.nextInt();

        int number = 0, max = 0, min = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayiyi girin: ");
            number = input.nextInt();
            if (number > max)
                max = number;
            if (number < min || min == 0)
                min = number;
        }
        System.out.println("En buyuk deger: " + max);
        System.out.println("En kucuk deger: " + min);

        input.close();
    }
}
