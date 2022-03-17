package kosulluIfadeler;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Mesafe girin(km): ");
		double distance = input.nextDouble();
		System.out.print("Yasinizi girin: ");
		int age = input.nextInt();
		System.out.print("Yolculuk tipini secin (1-Tek Yön, 2-Gidis-Dönüs): ");
		int flightType = input.nextInt();

		if (distance > 0 && age > 0 && (flightType == 1 || flightType == 2)) {
			double price = distance * 0.10;

			if (age < 12)
				price -= price * 0.5;
			else if (age > 11 && age < 25)
				price -= price * 0.1;
			else if (age > 65)
				price -= price * 0.3;

			if (flightType == 2)
				price = (price - (price * 0.2)) * 2;

			System.out.println(price + " ₺");

		} else
			System.out.println("Hatali Veri Girdiniz!");

		input.close();
	}

}
