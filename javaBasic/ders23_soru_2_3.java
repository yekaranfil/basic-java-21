package javaNormal;

public class ders23_soru_2_3 {

	public static void main(String[] args) {
		// Fibonacci serisinin ilk 30 elemanýný bulup bir diziye aktarýnýz, her elemaný kendisinden önceki elemana böldürerek sonucun altýn orana(~1,618) yaklaþtýðýný gözlemleyiniz.
		int[] dizi = new int[30];
		int a,b,c;
		a = 0;
		b = 1;
		c = 0;
		
		for(int i=0;i<30;i++) {
			c = a + b;
			dizi[i]=c;
			System.out.print(dizi[i]+"-");
			a = b;
			b = c;
		}
		
		System.out.println("\n");
		for(int i=1;i<30;i++) {
			System.out.print(((float)dizi[i]/dizi[i-1]) + "  -  ");
		}
	
	}

}
