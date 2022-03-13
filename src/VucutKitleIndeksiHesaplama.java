import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen boyunuzu girin(m): ");
		double boy = input.nextDouble();
		System.out.print("Lütfen kilonuzu girin(kg): ");
		double kilo = input.nextDouble();

		double index = kilo / (boy * boy);
		System.out.println("Vucut kitle indeksiniz: " + index);

		input.close();

	}

}
