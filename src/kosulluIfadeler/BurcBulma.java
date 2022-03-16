package kosulluIfadeler;

import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Dogdugunuz ayı girin: ");
		int month = input.nextInt();
		System.out.print("Dogdugunuz gunu girin: ");
		int day = input.nextInt();

		if ((month == 1 && day > 21) || (month == 2 && day < 20))
			System.out.println("Kova Burcu");

		else if ((month == 2 && day > 19) || (month == 3 && day < 21))
			System.out.println("Balık Burcu");

		else if ((month == 3 && day > 20) || (month == 4 && day < 21))
			System.out.println("Koc Burcu");

		else if ((month == 4 && day > 20) || (month == 5 && day < 22))
			System.out.println("Boga Burcu");

		else if ((month == 5 && day > 21) || (month == 6 && day < 23))
			System.out.println("Ikızler Burcu");

		else if ((month == 6 && day > 22) || (month == 7 && day < 23))
			System.out.println("Yengec Burcu");

		else if ((month == 7 && day > 22) || (month == 8 && day < 23))
			System.out.println("Aslan Burcu");

		else if ((month == 8 && day > 22) || (month == 9 && day < 23))
			System.out.println("Basak burcu");

		else if ((month == 9 && day > 22) || (month == 10 && day < 23))
			System.out.println("Terazi Burcu");

		else if ((month == 10 && day > 22) || (month == 11 && day < 22))
			System.out.println("Akrep Burcu");

		else if ((month == 11 && day > 21) || (month == 12 && day < 22))
			System.out.println("Yay Burcu");

		else if ((month == 12 && day > 21) || (month == 1 && day < 22))
			System.out.println("Oglak Burcu");

		input.close();
	}

}
