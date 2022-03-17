package kosulluIfadeler;

import java.util.Scanner;

public class ArtıkYılHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Yil girin: ");
		int year = input.nextInt();

		if ((year % 4 == 0 && year%100 != 0) || (year % 100 == 0 && year % 400 == 0))
			System.out.println(year + " artik yildir.");
		else
			System.out.println(year + " artik yil degildir.");

		input.close();
	}
}
