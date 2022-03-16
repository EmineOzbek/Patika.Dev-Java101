package kosulluIfadeler;

import java.util.Scanner;

public class SayilariSiralama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayiyi girin: ");
		int x = input.nextInt();
		System.out.print("İkinci sayiyi girin: ");
		int y = input.nextInt();
		System.out.print("Ücüncü sayiyi girin: ");
		int z = input.nextInt();

		if (x > y && x > z) {
			if (y > z)
				System.out.println(x + " > " + y + " > " + z);
			else if (z > y)
				System.out.println(x + " > " + z + " > " + y);

		} else if (y > x && y > z) {
			if (x > z)
				System.out.println(y + " > " + x + " > " + z);
			else if (z > x)
				System.out.println(y + " > " + z + " > " + x);

		} else if (z > x && z > y) {
			if (x > y)
				System.out.println(z + " > " + x + " > " + y);
			else if (y > x)
				System.out.println(z + " > " + y + " > " + x);
		}

		input.close();
	}
}
