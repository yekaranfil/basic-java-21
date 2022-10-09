package javaNormal;

import java.util.ArrayList;

public class ders47_soru7_1 {

	public static void main(String[] args) {
		//  İki ayrı sınıf (2 java dosyası) oluşturunuz. Bir tanesinde main method bulunsun,
		// diğerinde ise 2 adet method bulunsun, 
		// ilk method istenen sayıda ve sayı aralağında rastgle sayılar üretip arrayList return etsin,
		// ikinci method ise istenen sayıda ve istenen uzunlukta rastgele string üretip arraylist return etsin.
		Ureten u = new Ureten();		
		ArrayList<Integer> sl = u.sayiListesi(10, 20, 10);
		System.out.println(sl);
		
		ArrayList<String> str = u.stringListesi(4, 20);
		System.out.println(str);
	
	}

}
