package javaNormal;

import java.util.Scanner;

public class ders18_soru1_6 {

	public static void main(String[] args) {
		// Bir üçgende bir kenarýn uzuznluðu, diðer iki kenarýn toplamýndan büyük, farkýndan küçük olamaz. Kullanýcýdan 2 kenar uzunluðu alarak 3. kenarýn max ve min alabileceði deðeri hesaplayýnýz.
		int  a,b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a sayýsý : ");
		a = scan.nextInt();
		System.out.println("b sayýsý : ");
		b = scan.nextInt();
		
		int min = Math.abs(a-b);
		int max = Math.abs(a+b);
		
		System.out.println("Min = "+min+ "  Max = "+max);
		
		
	}

}
