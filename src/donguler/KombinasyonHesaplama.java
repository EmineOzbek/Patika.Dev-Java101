package donguler;

import java.util.Scanner;

public class KombinasyonHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("n sayisini girin: ");
		int n = input.nextInt();
		System.out.print("r sayisini girin: ");
		int r = input.nextInt();
		int nFac = 1, rFac = 1, nrFac = 1;
		int combination = 0;

		for (int i = 1; i <= n; i++) {
			nFac *= i;
		}
		for (int i = 1; i <= r; i++) {
			rFac *= i;
		}
		for (int i = 1; i <= (n - r); i++) {
			nrFac *= i;
		}

		combination = nFac / (rFac * nrFac);
		System.out.println("C(" + n + "," + r + ") = " + combination);

		input.close();
	}
}
