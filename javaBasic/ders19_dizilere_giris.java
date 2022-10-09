package javaNormal;

import java.util.Scanner;

public class ders19_dizilere_giris {

	public static void main(String[] args) {
		// Dizi deðiþkenler
		
		//int dizi_ilk[] = {1,2,3,4}
		int[] dizi = {2,0,1,6,7};
		// dizi[0] -> 2
		// dizi[1] -> 0
		// dizi[4] -> 7
		// dizi[5] -> taþma hatasý - overflow
		
		System.out.println(dizi[0]);
		
		dizi[1] = 4;
		
		for(int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i]+"-");
		}
		
		System.out.println();
		
		String[] s = new String[3]; // 3 tane string boþluk ayýrdým
		s[0] = "Onur";
		s[1] = "Oðuzhan";
		s[2] = "Ahmet";
		
		// String[] s = {"Onur","Oðuzhan","Ahmet"};
		
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+"-");
		}
		
		int[] sayilar = new int[15]; // 15 sayýlýk alaný bellekte rezerve ediyor
		
		System.out.println();
		
		//kullanacaðýnýn istediði sayýda dizi (dinamik dizi)
		int[] dinamikdizi;
		int boyut; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizi boyutunu giriniz=");
		boyut = scan.nextInt();
		dinamikdizi = new int[boyut];
		System.out.println(dinamikdizi.length);
	}

}
