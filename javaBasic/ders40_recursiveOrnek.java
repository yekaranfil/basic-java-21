package javaNormal;

import java.util.Scanner;

public class ders40_recursiveOrnek {
	
	static int topla(int bas,int bitis) {
		if(bitis>bas) {
		return bitis + topla(bas,bitis-1);
		} else return bitis;
	}

	public static void main(String[] args) {
		// Sayý aralýðý toplama - recursive
		int bas,bitis;
		Scanner scan = new Scanner(System.in);
		System.out.println("Baþlangýç deðeri :");
		bas = scan.nextInt();
		System.out.println("Bitiþ deðeri :");
		bitis = scan.nextInt();
		
		System.out.println(topla(bas, bitis));

	}

}
