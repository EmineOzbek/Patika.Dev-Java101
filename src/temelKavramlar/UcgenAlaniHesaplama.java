package temelKavramlar;
import java.util.Scanner;

public class UcgenAlaniHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kenar uzunlugu girin: ");
		int kenar1 = input.nextInt();
		System.out.print("Kenar uzunlugu girin: ");
		int kenar2 = input.nextInt();
		System.out.print("Kenar uzunlugu girin: ");
		int kenar3 = input.nextInt();

		int x = (kenar1 + kenar2 + kenar3) / 2;
		double a = x * (x - kenar1) * (x - kenar2) * (x - kenar3);
		double alan = Math.sqrt(a);
		System.out.println("Ucgenin alani: " + alan);

		input.close();

	}

}
