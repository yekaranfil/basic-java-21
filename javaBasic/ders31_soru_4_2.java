package javaNormal;

import java.util.ArrayList;
import java.util.Collections;

public class ders31_soru_4_2 {

	public static void main(String[] args) {
		// Sayýsal Loto programý yazýnýz? Arraylist kullanýlacak. 1-49 sayýlarý arasýndan 6 tanesini rastgele seçiniz?
		ArrayList<Integer> liste = new ArrayList<>();
		ArrayList<Integer> secim = new ArrayList<>();
		
		for(int i=1;i<=49;i++) liste.add(i);	
		//System.out.println(liste);
		
		Collections.shuffle(liste);
		//System.out.println(liste);
		
		for(int i=0;i<6;i++) secim.add(liste.get(i));
		
		Collections.sort(secim);
		System.out.println(secim);
		
	}

}
