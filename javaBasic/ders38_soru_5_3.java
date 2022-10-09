package javaNormal;

import java.util.Random;

public class ders38_soru_5_3 {
	
	static boolean hesapla(int s) {
		String k = Integer.toString(s);  //k = "3678"
		int binler,yuzler,onlar,birler;
		binler = Integer.parseInt(Character.toString(k.charAt(0)));
		yuzler = Integer.parseInt(Character.toString(k.charAt(1)));
		onlar = Integer.parseInt(Character.toString(k.charAt(2)));
		birler = Integer.parseInt(Character.toString(k.charAt(3)));
		
		if(binler%3==0 || (yuzler%3==0 && yuzler>0)|| (onlar%3==0 && onlar>0) || (birler%3==0 && birler>0)) return true;
		else return false;
	}
	

	public static void main(String[] args) {
		// Kendisine gönderilen dört basamaklý bir sayýnýn içinde 3'e bölünen bir 
		// rakam varsa true yoksa false gönderen methodu yazýnýz?
		Random r = new Random();
		int s = r.nextInt(9000)+1000;
		System.out.println(s);
		System.out.println(hesapla(s));
	}

}
