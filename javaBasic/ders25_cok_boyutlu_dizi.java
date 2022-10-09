package javaNormal;

import java.util.Random;

public class ders25_cok_boyutlu_dizi {

	public static void main(String[] args) {
		// Çok boyutlu diziler
		//int[][] matris = {{2,3,5},{4,5,3},{0,1,4}};
		int[][] matris = new int[3][3];
		
		//matris[0][0] = 3
		
		Random r = new Random();
		int i,j;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				matris[i][j]=r.nextInt(10);
				System.out.print(matris[i][j] + "  ");
			}
			System.out.println();
		}
		
		//matris[0][2] -> 0
		//matris[0][0] -> 3
		//matris[0][3] -> taþma hatasý
		//matris[2][1] -> 6
		
	}

}
