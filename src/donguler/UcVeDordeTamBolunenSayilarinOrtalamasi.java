package donguler;

import java.util.Scanner;

public class UcVeDordeTamBolunenSayilarinOrtalamasi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi girin: ");
		int number = input.nextInt();

		int sum = 0, counter = 0, average = 0;
		for (int i = 1; i < number; i++) {

			if (i % 3 == 0 && i % 4 == 0) {
				sum += i;
				counter++;
			}
		}
		average = sum / counter;
		System.out.println(average);

		input.close();
	}
}