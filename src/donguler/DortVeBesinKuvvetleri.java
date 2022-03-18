package donguler;

import java.util.Scanner;

public class DortVeBesinKuvvetleri {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi girin: ");
		int number = input.nextInt();
		int result = 0;
		int result2 = 0;

		for (int i = 1; i < number; i++) {
			result = (int) (Math.pow(4, i));
			System.out.println(" 4 ^ " + i + " = " + result);
		}
		System.out.println("--------------");

		for (int i = 1; i < number; i++) {
			result2 = (int) (Math.pow(5, i));
			System.out.println(" 5 ^ " + i + " = " + result2);
		}

		input.close();
	}
}
