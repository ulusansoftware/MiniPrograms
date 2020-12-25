package JavaMiniGames;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row,column;
		System.out.println("Mayýn Tarlasýna Hoþgeldiniz!");
		System.out.println("Lütfen Oynamak Ýstediðiniz Boyutlarý Giriniz!");
		System.out.print("Satýr Sayýsý :");
		row = scan.nextInt();
		System.out.print("Sütün Sayýsý :");
		column =scan.nextInt();
		
		MayinTarlasi mayin= new MayinTarlasi(3,3);
		mayin.run();
	}

}
