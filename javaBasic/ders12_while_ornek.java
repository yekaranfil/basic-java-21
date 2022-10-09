package javaNormal;

import java.util.Scanner;

public class ders12_while_ornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  sayi1,sayi2,islem;
		float sonuc;
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýlk sayýyý giriniz:");
		sayi1 = scan.nextInt();
		System.out.println("Ýkinci sayýyý giriniz:");
		sayi2 = scan.nextInt();
		System.out.println("Hangi iþlemi yapmak istiyorsunuz? \n1-Toplama 2-Çýkartma 3-Çarpma 4-Bölme");
		islem = scan.nextInt();
		
		switch (islem) {
		case 1:
			sonuc = sayi1 + sayi2;
			System.out.println("Ýki sayýnýn toplamý = " + sonuc);
			break;
		case 2:
			sonuc = sayi1 - sayi2;
			System.out.println("Ýki sayýnýn farký = " + sonuc);
			break;
		case 3:
			sonuc = sayi1 * sayi2;
			System.out.println("Ýki sayýnýn çarpýmý = " + sonuc);
			break;
		case 4:
			sonuc = (float) sayi1 / sayi2;
			System.out.println("Ýki sayýnýn bölümü = " + sonuc);
			break;
		default:
			System.out.println("1-4 arasý seçim yapýnýz!");
			break;
		}
		
		System.out.print("Ýþlemi sonlandýrmak için 0 basýnýz, devam etmek için herhangi bir sayý giriniz");
		int cikis = scan.nextInt();
		if(cikis==0) {
			break;
			}
		
		}

	}

}
