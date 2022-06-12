package donguler;

import java.util.Scanner;

public class UsluSayiHesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Ussu alinacak sayiyi girin: ");
		int x = input.nextInt();

		System.out.print("Us sayisini girin: ");
		int y = input.nextInt();

		int total = 1;
		for (int i = 1; i <= y; i++) {
			total *= x;
		}
		
		System.out.println(x + " ^ " + y + " = " + total);
	
		input.close();
	}
}
