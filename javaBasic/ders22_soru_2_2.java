package javaNormal;

import java.util.Random;

public class ders22_soru_2_2 {

	public static void main(String[] args) {
		// Dört basamaklý rastgele 20 adet sayý üretip bir diziye aktarýnýz, 3'e tam bölünenlerin toplamýndan, 4'e tam bölünenlerin toplamýný çýkartýnýz.
		int[] dizi = new int[20];
		Random r = new Random();
		int sayi = 0;
		int us,ut,ds,dt;
		us=ut=ds=dt=0;
		
		for(int i=0;i<20;i++) {
			sayi = r.nextInt(9000)+1000; //1000 ile 9999
			dizi[i]=sayi;
			System.out.print(dizi[i]+"-");
			if(dizi[i]%3==0) {
				us++;
				ut += dizi[i];
			}
			if(dizi[i]%4==0) {
				ds++;
				dt += dizi[i];
			}
		}
	
		System.out.println();
		System.out.println("Üçe bölünen sayý adeti="+us);
		System.out.println("Üçe bölünen sayý toplamý="+ut);
		System.out.println("Dörde bölünen sayý adeti="+ds);
		System.out.println("Dörde bölünen sayý toplamý="+dt);
		System.out.println("Farklarý ="+ (ut-dt));
		
	}

}
