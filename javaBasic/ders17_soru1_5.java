package javaNormal;

import java.util.Scanner;

public class ders17_soru1_5 {

	public static void main(String[] args) {
		// Ýkinci dereceden denklemin diskriminant çözümünü yazýnýz?
		int a,b,c;
		float delta,k1,k2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a sayýsý : ");
		a = scan.nextInt();
		System.out.println("b sayýsý : ");
		b = scan.nextInt();
		System.out.println("c sayýsý : ");
		c = scan.nextInt();
		
		delta = (float) (Math.pow(b, 2) - (4*a*c));
		System.out.println("Delta = "+delta);
		
		if(delta>0) {
			k1 = (float) (-b - Math.sqrt(delta)) / (2*a);
			k2 = (float) (-b + Math.sqrt(delta)) / (2*a);
			System.out.println("Ýki kök vardýr =" + k1 +" , "+ k2 );
		} if(delta==0) {
			k1 = (float) -b/(2*a);
			System.out.println("Çakýþýk kök = "+ k1);
		} else {
			System.out.println("Kök yoktur");
		}
		
		
	}

}
