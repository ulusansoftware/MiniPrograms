package JavaMiniPrograms;

import java.util.Scanner;

public class KDVHesaplama {

	public static void main(String[] args) {
		double tutar, kdvfiyat, kdv = 0.18;

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Lutfen Urunun tutarini giriniz :");
			tutar = input.nextDouble();
		}
		kdvfiyat = tutar + (tutar * kdv);
		System.out.println("Urunun KDV'li Fiyati : " + kdvfiyat);

	}

}
