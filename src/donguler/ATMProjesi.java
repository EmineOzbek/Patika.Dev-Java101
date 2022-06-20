package donguler;

import java.util.Scanner;

public class ATMProjesi {

    public static void main(String[] args) {

        int counter = 3, balance = 7000;
        while (counter > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanici adinizi girin: ");
            String userName = input.nextLine();
            System.out.print("Sifrenizi girin: ");
            String password = input.nextLine();

            if (userName.equals("patika.dev") && password.equals("123456")) {
                System.out.println("Giris yapildi.");

                int select, choice;
                do {
                    System.out.println("Yapmak istediginiz islemi secin: \n 1-Para cekme \n 2-Para yatirma \n 3-Bakiye sorgulama \n 4-Cikis yap");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Cekmek istediginiz tutari girin: ");
                            int price = input.nextInt();
                            if (balance >= price) {
                                System.out.println("Lutfen paranizi alin.");
                                balance -= price;
                            } else
                                System.out.println("Bakiye yetersiz!");
                            break;
                        case 2:
                            System.out.print("Yatirmak istediginiz tutari girin: ");
                            int price2 = input.nextInt();
                            balance += price2;
                            System.out.println("Para yatirma isleminiz basarili.");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + "₺");
                            break;
                        case 4:
                            counter = 0;
                            break;
                    }
                    System.out.println("Baska islem yapmak istiyor musunuz? \n 1-Evet \n 2-Hayır");
                    select = input.nextInt();
                }
                while (select == 1 && counter != 0);
                System.out.println("Cıkıs yapildi.");
            } else {
                System.out.println("Hatali giris! Lütfen tekrar deneyin.");
                counter--;
                System.out.println("Kalan hakkiniz: " + counter);
                if (counter == 0)
                    System.out.println("3 kez hatali giris yaptiniz, kartiniz kullanima kapatilmistir! Lütfen banka ile iletisime gecin.");
            }
        }
    }
}
