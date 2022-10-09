package javaNormal;

import java.util.Random;
import java.util.Scanner;

public class ders42_soru_6_1_2 {
	
	static int[][] matrisYap(int satir,int sutun){
		int[][] m = new int[satir][sutun];
		Random r = new Random();
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				m[i][j] = r.nextInt(40)+10;
			}
		}		
		
		return m;
	}
	
	static void matrisYaz(int[][] m,int satir,int sutun) {
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				System.out.print(m[i][j]+ "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static int[][] matrisTopla(int[][] m1,int[][]m2,int satir,int sutun){
		int[][] mt = new int[satir][sutun];
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				mt[i][j] = m1[i][j]+m2[i][j];
			}
		}
		return mt;
	}

	public static void main(String[] args) {
		//1-Kendisine gönderilen satır ve sütun bilgilerine göre rastgele matris üretip return eden methodu yazınız?
	    //2-Kendisine gönderilen iki matrisi toplayıp sonucu gönderen matrisi methodu yazınız?
		int satir,sutun;
		Scanner scan = new Scanner(System.in);
		System.out.println("Satır sayısı:");
		satir = scan.nextInt();
		System.out.println("Sütun sayısı:");
		sutun = scan.nextInt();
		int[][] m1 = matrisYap(satir, sutun);
		matrisYaz(m1, satir, sutun);
		int[][] m2 = matrisYap(satir, sutun);
		matrisYaz(m2, satir, sutun);
		int[][] mt = matrisTopla(m1, m2, satir, sutun);
		matrisYaz(mt, satir, sutun);
	}

}
