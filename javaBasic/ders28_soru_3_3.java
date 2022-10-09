package javaNormal;

import java.util.Random;

public class ders28_soru_3_3 {

	public static void main(String[] args) {
		// Magic Square
		Random r = new Random();
		int i,j,s1,s2,s3,s4,swap;
		int a,b,c,d,e,f,g,h;
		int sayac = 0;
		
		//standart 1-9 sýralý matris oluþturdum
		int[][] m = {{1,2,3},{4,5,6},{7,8,9}};
		
		while(true) {
		//harmanlama 
		for(i=0;i<10;i++) {
			s1=r.nextInt(3); //0,1,2 üretir
			s2=r.nextInt(3);
			s3=r.nextInt(3);
			s4=r.nextInt(3);
			swap = m[s1][s2];
			m[s1][s2] = m[s3][s4];
			m[s3][s4] = swap;
		}
		
		//harmanlama sonrasý matris
		/*System.out.println("Harmanlanmýþ matris");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(m[i][j]+ "  ");
			}
			System.out.println();
		} */
		
		a = m[0][0] + m[0][1] + m[0][2];
		b = m[1][0] + m[1][1] + m[1][2];
		c = m[2][0] + m[2][1] + m[2][2];
		
		d = m[0][0] + m[1][0] + m[2][0];
		e = m[0][1] + m[1][1] + m[2][1];
		f = m[0][2] + m[1][2] + m[2][2];
		
		g = m[0][0] + m[1][1] + m[2][2];
		h = m[0][2] + m[1][1] + m[2][0];
		
		if(a==b && b==c && a==d && d==e && e==f && a==g && g==h) {
			System.out.println("Matris Magic Square");
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					System.out.print(m[i][j]+ "  ");
				}
				System.out.println();
			}
			break;
		} else {
			System.out.println("Matris Magic Square deðildir!");
		}
		sayac++;
		System.out.println(sayac+". deneme");
		
		}
		
	}

}
