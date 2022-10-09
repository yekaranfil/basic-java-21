package javaNormal;

import java.util.Scanner;

public class ders53_soru8_2 {

	public static void main(String[] args) {
		/*  Kullanýcýdan alýnan sayýyý yine kullanýcýn istediði tabana dönüþtüren Class tasarlayýnýz?
		Açýklama: Kullanýcýdan alýnan sayý 12 olsun dönüþtürülecek taban 2'li taban olsun.
		Taban.donustur(12,2) þeklinde girilen sayý 1100 þeklinde return edilsin.
		17 sayýsý 5 tabýnýna dönüþtürüleceðinde;
		Taban.donustur(17,5) þeklinde girilen sayý 32 þeklinde 5 tabanýnda return edilsin. 
		*/
		
		Tabanus t = new Tabanus();
		


		Scanner a = new Scanner(System.in);
		int c,b;
		System.out.println("sayý deðeri giriniz");
		c = a.nextInt();

		System.out.println("taban deðerini giriniz");
		b = a.nextInt();
		System.out.println(t.tabanBul(c, b));



	
	}

}
