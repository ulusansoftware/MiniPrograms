package JavaMiniPrograms;
import java.util.Scanner;
public class ucakBiletiHesaplayanProgram {

	public static void main(String[] args) {
		// km birim fiyati :0.10$
		// 12 yasindan kucukse toplam fiyata %50 indirim
		// 12 ve 24 yas arasindaysa %10 indirim
		// 65 yasindan buyukse %30 indirim
		// Gidis donus alirsa %20 indirim
		// Bu kosullara gore ucak bileti hesaplayan program
		
		try (Scanner scan = new Scanner(System.in)) {
			int km,yas,tip;
			System.out.println("Welcome to Airport");
			System.out.println("Enter the distance :");
			km = scan.nextInt();
			System.out.println("Enter your age :");
			yas = scan.nextInt();
			System.out.println("\nSelect the trip type+ (1- One going , 2- Round Trip):");
			tip = scan.nextInt();
			
			double normalFiyat,yasIndirimi,tipIndirimi;
			
			
			
			if(km>0 && yas>0 && (tip==1 || tip==2)) {
				normalFiyat = km * 0.10;
			if(yas<12 ) {	
				yasIndirimi = normalFiyat * 0.5 ; //Indirim oraný hesapliyorum.
			} else if(yas>=12 && yas<=24){
				yasIndirimi = normalFiyat * 0.10;
			} else if(yas>= 65) {
				yasIndirimi = normalFiyat * 0.30;
				}else {
					yasIndirimi =0;
				}
			normalFiyat -= yasIndirimi;// Fiyattan indirim payimi cikartiyorum.
			if (tip == 2) {
				tipIndirimi = normalFiyat * 0.20 ;
				normalFiyat -= tipIndirimi * 2;
			}
			System.out.println("Ticket Amount : " + normalFiyat +"$");
			} else {
				System.out.println("The values you entered are missing or incorrect. Please try again!");
				
			}
		}
	}

}
