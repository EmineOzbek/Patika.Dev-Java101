package kosulluIfadeler;

import java.util.Scanner;

public class SinifGecmeDurumu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int total = 0, lessons = 0;

		System.out.print("Matematik notunuzu girin: ");
		int maths = input.nextInt();
		if (maths > 0 || maths <= 100) {
			total += maths;
			lessons++;
		}
		System.out.print("Fizik notunuzu girin: ");
		int physical = input.nextInt();
		if (physical > 0 || physical >= 100) {
			total += physical;
			lessons++;
		}
		System.out.print("Turkce notunuzu girin: ");
		int turkish = input.nextInt();
		if (turkish > 0 || turkish <= 100) {
			total += physical;
			lessons++;
		}
		System.out.print("Kimya notunuzu girin: ");
		int chemical = input.nextInt();
		if (chemical > 0 || chemical <= 100) {
			total += chemical;
			lessons++;
		}
		System.out.print("Muzik notunuzu girin: ");
		int music = input.nextInt();
		if (music > 0 || music <= 100) {
			total += music;
			lessons++;
		}

		double average = total / lessons;
		if (average >= 55)
			System.out.println("Tebrikler! Dersi gectiniz.");
		else
			System.out.println("Dersi gecemediniz!");

		input.close();
	}
}
