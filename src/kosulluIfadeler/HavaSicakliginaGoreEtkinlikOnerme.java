package kosulluIfadeler;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Hava sicakligini girin: ");
		int heat = input.nextInt();

		if (heat < 5)
			System.out.println("Kayak yapabilirsiniz.");
		if (heat >= 5 && heat < 15)
			System.out.println("Sinemaya gidebilirsiniz.");
		if (heat >= 15 && heat < 25)
			System.out.println("Piknige gidebilirsiniz.");
		if (heat >= 25)
			System.out.println("Yüzmeye gidebilirsiniz");

		input.close();
	}

}