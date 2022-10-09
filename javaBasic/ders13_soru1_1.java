package javaNormal;

import java.util.Scanner;

public class ders13_soru1_1 {

	public static void main(String[] args) {
		//  Kullanıcıda 3 sayı alarak bunlardan en büyük ve en küçüğün ortalamasını bularak ekrana yazdırınız?

		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.println("a sayısı : ");
		a = scan.nextInt();
		System.out.println("b sayısı : ");
		b = scan.nextInt();
		System.out.println("c sayısı : ");
		c = scan.nextInt();
		
		int eb,ek;
		
		if(a>b && a>c) {
			eb=a;
		} else if(b>a && b>c) {
			eb=b;
		} else {
			eb=c;
		}
		
		if(a<b && a<c) {
			ek=a;
		} else if(b<a && b<c) {
			ek=b;
		} else {
			ek=c;
		}
		
		System.out.println("Toplam ="+ (eb+ek));
		System.out.println("Ortalama ="+ (float)(eb+ek)/2);
	}

}
