package Fonksiyonlar;

import java.util.Scanner;

public class Ortalama {

	public static void main(String[] args) {
		double sonuc = 0;
		int[] notlar = new int[7];
		int toplam = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome To Student Technical ! \nPlease enter your notes in order .");
		System.out.println("Math 1 : ");
		notlar[0] = scan.nextInt();
		System.out.println("Turkish 1 :");
		notlar[1] = scan.nextInt();
		System.out.println("Physics 1 :");
		notlar[2] = scan.nextInt();
		System.out.println("History 1 :");
		notlar[3] = scan.nextInt();
		System.out.println("Chemistry :");
		notlar[4] = scan.nextInt();
		System.out.println("Physical Education :");
		notlar[5] = scan.nextInt();
		System.out.println("Music :");
		notlar[6] = scan.nextInt();

		for (int not : notlar) {
			toplam += not;

		}
		System.out.println("Average :" + (toplam / notlar.length));
	}

}
