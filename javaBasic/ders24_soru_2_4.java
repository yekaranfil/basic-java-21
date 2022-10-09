package javaNormal;

import java.util.Scanner;

public class ders24_soru_2_4 {

	public static void main(String[] args) {
		/* Bir bankomat içerisinde 5,10,20,50,100 ve 200 tl'lik banknotlar barındırmaktadır. Kullanıcı 5 tl'nin katlarını çekebilmektedir. Kullanıcıdan çekeceği miktarı alınız, en büyük banknottan başlayarak bankomatın vereceği banknotları yazınız?
			Örnek çıktı:
			Kaç para çekmek istiyorsunuz? 345
			1 adet 200
			1 adet 100
			2 adet 20
			1 adet 5 */
		
		Scanner scan = new Scanner(System.in);
		int para,kalan;
		System.out.println("Kaç para çekmek istiyorsunuz?");
		para = scan.nextInt();
		kalan = 0;
		
		if(para>=200) {
			kalan=para - (para%200);
			System.out.println(kalan/200+ " adet 200 tl");
			para = para%200;
		}
		
		if(para>=100) {
			kalan=para - (para%100);
			System.out.println(kalan/100+ " adet 100 tl");
			para = para%100;
		}
		
		if(para>=50) {
			kalan=para - (para%50);
			System.out.println(kalan/50+ " adet 50 tl");
			para = para%50;
		}
		
		if(para>=20) {
			kalan=para - (para%20);
			System.out.println(kalan/20+ " adet 20 tl");
			para = para%20;
		}
		
		if(para>=10) {
			kalan=para - (para%10);
			System.out.println(kalan/10+ " adet 10 tl");
			para = para%10;
		}
		
		if(para>=5) {
			kalan=para - (para%5);
			System.out.println(kalan/5+ " adet 5 tl");
			
		}

	}

}
