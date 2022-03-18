package donguler;

import java.util.Scanner;

public class CiftVeDordunKatiOlanSayilarinToplami {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = 0;
		int total = 0;

		do {
			System.out.print("Sayi girin: ");
			number = input.nextInt();

			if (number % 2 == 0 || number % 4 == 0)
				total += number;

		} while (number % 2 == 0);

		System.out.println("Toplam: " + total);

		input.close();
	}
}
