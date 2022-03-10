import java.util.Scanner;

public class NotOrtalamasiHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunuzu girin: ");
		int matematik = input.nextInt();
		System.out.print("Fizik notunuzu girin: ");
		int fizik = input.nextInt();
		System.out.print("Kimya notunuzu girin: ");
		int kimya = input.nextInt();
		System.out.print("Turkce notunuzu girin: ");
		int turkce = input.nextInt();
		System.out.print("Tarih notunuzu girin: ");
		int tarih = input.nextInt();
		System.out.print("Muzik notunuzu girin: ");
		int muzik = input.nextInt();

		int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
		double ortalama = toplam / 6;
		System.out.println("Ortalamanız: " + ortalama);

		String durum = ortalama > 60 ? "Sinifi Gecti." : "Sinifta Kaldi.";
		System.out.println(durum);
		input.close();
	}

}
