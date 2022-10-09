package javaNormal;

import java.util.ArrayList;
import java.util.Random;

public class Ureten {

	ArrayList<Integer> sayiListesi(int baslangic, int bitis, int adet){
		Random r = new Random();
		ArrayList<Integer> sayilar = new ArrayList<>();
		for(int i=0;i<adet;i++) {
			sayilar.add(r.nextInt(bitis-baslangic)+baslangic);
		}
		return sayilar;
	}

	ArrayList<String> stringListesi(int boyut, int adet){
		Random r = new Random();
		ArrayList<String> stringler = new ArrayList<>();

		for(int i=0;i<adet;i++) {
			String s = "";
			for(int j=0;j<boyut;j++) {
				s += (char)((char) r.nextInt(26)+65);
			}
			stringler.add(s);
		}

		return stringler;
	}

}
