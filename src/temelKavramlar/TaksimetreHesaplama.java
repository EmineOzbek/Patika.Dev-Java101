package temelKavramlar;
import java.util.Scanner;

public class TaksimetreHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Km'yi girin: ");

		double km = input.nextDouble();
		double tutar = 10;

		tutar += km * 2.20;

		tutar = tutar < 20 ? 20 : tutar;
		System.out.println("Toplam tutar: " + tutar);

		input.close();
	}
}
