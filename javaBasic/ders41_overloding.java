package javaNormal;

public class ders41_overloding {
	
	static int topla(int a,int b) {
		return a + b;
	}
	
	static int topla(int a, int b, int c) {
		return a + b + c;
	}
	
	static float topla(float a,float b, float c) {
		return a + b + c;
	}
	

	public static void main(String[] args) {
		// Methodlarda overloading - aþýrý yükleme
		// ayný isimli fakat farklý parametrelere sahip methodlar yazýlýabilir
		
		System.out.println(topla(3,5));
		System.out.println(topla(7,8,1));
		System.out.println(topla((float)0.5, (float)7.5, (float)1.25));

	}

}
