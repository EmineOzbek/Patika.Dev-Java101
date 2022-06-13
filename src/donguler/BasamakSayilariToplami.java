package donguler;

import java.util.Scanner;

public class BasamakSayilariToplami {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi girin: ");
		int number = input.nextInt();

		int result = 0;

		while (number > 0) {
			result += number % 10;
			number /= 10;
		}
		System.out.println("Girdiginiz sayinin basamak sayilari toplami: " + result);

		input.close();
	}
	
}
