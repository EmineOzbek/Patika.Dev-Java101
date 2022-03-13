import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen boyunuzu girin(m): ");
		double boy = input.nextDouble();
		System.out.print("Lütfen kilonuzu girin(kg): ");
		double kilo = input.nextDouble();

		double indeks = kilo / (boy * boy);
		System.out.println("Vucut kitle indeksiniz: " + indeks);

		if (indeks > 18.4 && indeks < 25)
			System.out.println("Vucut kitle indeksiniz normal seviyede.");
		else if (indeks < 18.5)
			System.out.println("Vucut kitle indeksiniz normalin altında.");
		else if (indeks > 24)
			System.out.println("Vucut kitle indeksiniz normalin üzerinde.");

		input.close();
	}
}
