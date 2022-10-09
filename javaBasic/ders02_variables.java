package javaNormal;

public class ders02_variables {

	public static void main(String[] args) {
		// Tek satýrlýk açýklama 
		/* Çok
		 * satýrlý
		 * açýklama
		 */
		
		//Variables - Deðiþkenler
		int a = 5; //bu direk oluþtururken deðer atadým
		a = 7; //daha sonra da atama yapýlabilir
		
		int b;
		b = a + 5; //b kaç olur? 
		//int = integer = tam sayý demektir. 4 byte alan kaplar
		//2^32 -1 kadar deðer
		//negatif deðer de alýr
		int c;
		c = a-b; // -5
		System.out.println(c);
		
		//byte -127 ile +127 arasý 
		byte d = 34;
		//d = 245; aralýk dýþýnda tanýmlama yapýlamaz
		
		//short 32768 ile -32768
		short e = -130;
		
		//long 2^64
		long f = 356788883;
		
		//float noktalý sayýlar
		float g = (float) 3.14; //casting 
		
		//double 2^64 noktalý sayýlar
		double h = 6.89765432;
		
		//boolean true - false
		boolean durum = false;
		System.out.println(durum);
		
		// char karakter deðiþkenler
		char i = 'k';
		System.out.println("Karakter = " + i);
		System.out.println((char)64);
		System.out.println((int)'@');
		
		//String
		// String sýnýfý primitive deðildir
		String s ="Algoritma dersini";
		s = s + " çok seviyorum";
		System.out.println(s);
		
		int k,l,m;
		k = l = m = 5;
		System.out.println(k+l+m);
		System.out.println(Integer.toString(k)+ Integer.toString(l)+ Integer.toString(m) );
		//Integer.toString(sayi) -> sayýyý stringe çevirir
		System.out.println((float)k); //casting dönüþüm
		
	}

}
