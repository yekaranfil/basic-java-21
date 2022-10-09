package javaNormal;

public class ders10_fibonacci {

	public static void main(String[] args) {
		// Fibonacci serisi
		// 0-1-1-2-3-5-8-13-21-34-55
		int a = 0;
		int b = 1;
		int c;
		
		System.out.print(a+"-"+b+"-");
		
		for(int i=0;i<10;i++) {
			c = a + b;
			System.out.print(c + "-");
			a = b; // yeni a ve b deðerlerini kaydýrýyoruz
			b = c;
		}
		
		
	}

}
