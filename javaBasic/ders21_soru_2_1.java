package javaNormal;

import java.util.Random;

public class ders21_soru_2_1 {

	public static void main(String[] args) {
		// Rastgele üç harfli 20 adet string oluþturarak bir diziye atayýnýz?
		String[] dizi = new String[20];
		Random r = new Random();
		int sayi = 0;
		
		for(int j=0;j<20;j++) {
		String s = "";
		for(int i=0;i<3;i++) {			
			char k = ' ';
			sayi = r.nextInt(100);
			if(sayi<50) k = (char) ((char) r.nextInt(26)+65);
			else k = (char) ((char) r.nextInt(26)+97);
			s += k;
		}
		dizi[j] = s;
		System.out.print(dizi[j]+"-");
		}
		
		
		

	}

}
