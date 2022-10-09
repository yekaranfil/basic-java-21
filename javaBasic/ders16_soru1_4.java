package javaNormal;

public class ders16_soru1_4 {

	public static void main(String[] args) {
		// 100' den büyük, 10000'den küçük fibonacci sayýlarýný bulunuz?
		int a,b,c;
		a=0;
		b=1;
		c=0;
		
		while(c<10000) {
			c = a + b;
			if(c>=100 && c<=10000) {
				System.out.print(c+"-");
			}
			a = b;
			b = c;
		}
		
	}

}
