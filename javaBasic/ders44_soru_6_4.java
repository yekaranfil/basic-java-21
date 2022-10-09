package javaNormal;

import java.util.Scanner;

public class ders44_soru_6_4 {

	public static void main(String[] args) {
		// Girilen saati yazýyla yazdýrmak. Saat 24 saat formatýnda ve SS:DD  (saat
		// ve dakika) þeklinde girilecek. Yazý ile yazdýrýldýktan sonra; öðleden
		// önce ÖÖ ve öðleden sonra ÖS þeklinde ek yazdýrýlacak.
		String[] hour = {"oniki","bir","iki","üç","dört","beþ","altý","yedi","sekiz","dokuz","on","onbir"};
		String[] mo = {"sýfýr","on","yirmi","otuz","kýrk","elli"};
		String[] mb = {"","bir","iki","üç","dört","beþ","altý","yedi","sekiz","dokuz"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Saati giriniz:");
		String zaman = scan.next();
		String saat = Character.toString(zaman.charAt(0)) + Character.toString(zaman.charAt(1));
		int s = Integer.parseInt(saat);
		System.out.print(hour[s%12]+ " ");
		int onlar = Integer.parseInt(Character.toString(zaman.charAt(3)));
		System.out.print(mo[onlar]);
		int birler = Integer.parseInt(Character.toString(zaman.charAt(4)));
		System.out.print(mb[birler]+"  ");
		if(s<12) System.out.print("ÖÖ"); else System.out.print("ÖS");
		
	}

}
