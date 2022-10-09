package javaNormal;

import java.util.Scanner;

public class ders06_kosul {

	public static void main(String[] args) {
		// kullanýcýdan 2 sayý alalým
		// büyük olaný bulalým
		// eþit ise eþittir
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("a sayýsýný giriniz");
		a = scan.nextInt();
		System.out.println("b sayýsýný giriniz");
		b = scan.nextInt();

		if(a>b) {
			System.out.println("a sayýsý büyüktür");
		} else if(b>a) {	
			System.out.println("b sayýsý büyüktür");
		} else {
			System.out.println("sayýlar eþittir");
		}
		
		
	}

}
