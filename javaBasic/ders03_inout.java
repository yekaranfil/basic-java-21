package javaNormal;

import java.util.Scanner;

public class ders03_inout {

	public static void main(String[] args) {
		// Dýþardan veri almak ve yazdýrmak
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Ýsminizi giriniz:");
		//String isim = scan.next(); //okuma iþlemi 
		//next komutu boþluk karakterine kadar okur
		//System.out.println("Hoþgeldin " + isim);
		
		System.out.println("Ýsminizi ve soyisminizi giriniz:");
		String isimSoyisim = scan.nextLine();
		System.out.println("Hoþgeldin " + isimSoyisim);
	}

}
