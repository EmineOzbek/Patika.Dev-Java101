import java.util.Scanner;

public class KdvTutariHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Fiyat girin: ");
		
		double fiyat = input.nextInt();
		double kdvOrani = 0;

		if (fiyat < 1000) {
			kdvOrani = 0.18;
		} else
			kdvOrani = 0.08;
		
		double kdv = fiyat * kdvOrani;
		double fiyat2 = fiyat + kdv;

		System.out.println("KDV'siz fiyat: " + fiyat);
		System.out.println("KDV orani: " + kdvOrani);
		System.out.println("KDV tutari: " + kdv);
		System.out.println("KDV'li fiyat: " + fiyat2);

		input.close();
	}
}
