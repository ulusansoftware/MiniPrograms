package JavaMiniPrograms;

import java.util.Scanner;

public class NotOrtalamaProgram {

	public static void main(String[] args) {
		int quiz, vize, fýnal, but;
		double ortalama;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Quiz notunu giriniz :");
			quiz = input.nextInt();
			System.out.println("Vize notunu giriniz : ");
			vize = input.nextInt();
			System.out.println("Final notunu giriniz: ");
			fýnal = input.nextInt();
			System.out.println("But notunu giriniz : ");
			but = input.nextInt();
		}
		ortalama = (quiz * 0.1) + (vize * 0.2) + (fýnal * 0.4) + (but * 0.3);
		System.out.println(" Not ortalamanýz : " + ortalama);
		String sonuc = (ortalama >= 50) ? "Olumlu" : "Olumsuz";
		System.out.println(sonuc);

	}

}
