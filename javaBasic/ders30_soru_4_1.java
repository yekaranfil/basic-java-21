package javaNormal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ders30_soru_4_1 {

	public static void main(String[] args) {
		// Bir ArrayList tanýmlayýp içerisini reastgele 3 karakterden oluþan 100 string ile doldurunuz. Daha sora bu stringi "A'dan Z'ye" ve "Z'den A'ya" alfabetik olarak sýralayýnýz?
		Random r = new Random();
		ArrayList<String> liste = new ArrayList<>();

		for(int j=0;j<100;j++) {
			String s = "";
			int sayi= 0;
			for(int i=0;i<3;i++) {
				sayi = r.nextInt(26)+65;
				s += (char) sayi;
			}
			liste.add(s);
		}
		
		System.out.println(liste);
		
		Collections.sort(liste);
		System.out.println(liste);
		
		Collections.reverse(liste);
		System.out.println(liste);

	}

}
