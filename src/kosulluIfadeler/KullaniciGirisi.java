package kosulluIfadeler;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Kullanizi adinizi girin: ");
		String userName = input.nextLine();
		System.out.print("Sifrenizi girin: ");
		String password = input.nextLine();

		if (userName.equals("emine")) {

			if (password.equals("12345")) {
				System.out.println("Giris basarili.");

			} else {
				System.out.print("Hatali sifre! ");
				System.out.println("Sifrenizi sifirlamak ister misiniz? \n" + "1-Evet \n2-Hayir ");
				int select = input.nextInt();

				if (select == 1) {

					Scanner scan = new Scanner(System.in);
					System.out.print("Yeni sifrenizi girin: ");
					String newPassword = scan.nextLine();

					if (newPassword.equals("12345"))
						System.out.println("Yeni sifreniz eski sifrenizle aynı olamaz. Lütfen baska bir sifre girin: ");
					else
						System.out.println("Sifreniz olusturuldu.");

					scan.close();
				}
			}
		} else
			System.out.println("Hatali kullanici adi!");

		input.close();
	}
}
