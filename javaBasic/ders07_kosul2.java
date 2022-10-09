package javaNormal;

import java.util.Scanner;

public class ders07_kosul2 {

	public static void main(String[] args) {
		// Vücut kitle endeksi
		// index = kilo/(boy*boy) 
		// boy deðeri metre
		// index <20 zayýf
		// 20<index<25 ise normal
		// index>25
		
		float boy,kilo,index;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz");
		kilo = scan.nextFloat();
		System.out.println("Boyunuzu giriniz (m)");
		boy = scan.nextFloat();
		
		index = kilo / (boy*boy);
		System.out.println("Vücut kitle endeksiniz = "+ index);
		
		if(index<20) {
			System.out.println("Zayýfsýnýz!");
		} else if(index>=20 && index<25) {  // AND = &&
			System.out.println("Normal");
		} else {
			System.out.println("Kilolusunuz!");
		}
		

	}

}
