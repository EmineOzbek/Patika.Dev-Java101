import java.util.Scanner;

public class DaireninAlaniniHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Dairenin yaricapini girin r=");
		int r = input.nextInt();
		System.out.print("Dairenin merkez aci ölcüsünü girin a=");
		int a = input.nextInt();
		double pi = 3.14;

		double alan = (pi * (r * r) * a) / 360;
		System.out.println("Dairenin alani: " + alan);

		input.close();
	}

}
