import java.util.Scanner;

public class ManavKasaHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Armut kg girin: ");
		double armut = input.nextDouble();
		armut *= 2.14;

		System.out.print("Elma kg girin: ");
		double elma = input.nextDouble();
		elma *= 3.67;

		System.out.print("Domates kg girin: ");
		double domates = input.nextDouble();
		domates *= 1.11;

		System.out.print("Muz kg girin: ");
		double muz = input.nextDouble();
		muz *= 0.95;

		System.out.print("Patlican kg girin: ");
		double patlican = input.nextDouble();
		patlican *= 5;

		double tutar = armut + elma + domates + muz + patlican;
		System.out.print("Tutar= " + tutar);

		input.close();
	}
}
