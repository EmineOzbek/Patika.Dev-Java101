package kosulluIfadeler;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayiyi girin: ");
		int x = input.nextInt();
		System.out.print("İkinci sayiyi girin: ");
		int y = input.nextInt();
		System.out.print("1-Toplama \n2-Cıkarma \n3-Carpma \n4-Bolme \n" + "İslem turu secin: ");
		int islem = input.nextInt();

		switch (islem) {
		case 1:
			System.out.println("Sonuc: " + (x + y));
			break;
		case 2:
			System.out.println("Sonuc: " + (x - y));
			break;
		case 3:
			System.out.println("Sonuc: " + (x * y));
			break;
		case 4:
			System.out.println("Sonuc: " + (x / y));
			break;
		default:
			System.out.println("Gecersiz secim.");
		}

		input.close();
	}
}
