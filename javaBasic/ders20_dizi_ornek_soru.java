package javaNormal;

import java.util.Random;

public class ders20_dizi_ornek_soru {

	public static void main(String[] args) {
		// 10 tane rastgele sayý üretip bir diziye aktaralým. (0-100 arasý rastgele sayý)
		// kaç adet tek sayý var? toplamlarý? ortalamalarý kaç?
		// kaç adet çift sayý var? toplamlarý? ortalamalarý?
		
		Random r = new Random(); // rastgele sayý üretmek için nesne tanýmlýyoruz
		//System.out.println(r.nextInt(100));
		
		int[] dizi = new  int[10];
		int teksayac, ciftsayac, tektoplam, cifttoplam;
		float tekort,ciftort;
		teksayac = tektoplam = ciftsayac = cifttoplam = 0;
		
		for(int i=0;i<dizi.length;i++) {
			dizi[i]= r.nextInt(100);
			System.out.print(dizi[i]+"-");
			if(dizi[i]%2==0) {
				ciftsayac++;
				cifttoplam += dizi[i];
			} else {
				teksayac++;
				tektoplam += dizi[i];
			}
		}
		
		System.out.println();
		System.out.println("Çift sayý adeti="+ciftsayac);
		System.out.println("Çift sayý toplamý="+cifttoplam);
		ciftort = (float) cifttoplam / ciftsayac;
		System.out.println("Çift sayý ortalamasý="+ciftort);
		System.out.println();
		System.out.println("Tek sayý adeti="+teksayac);
		System.out.println("Tek sayý toplamý="+tektoplam);
		tekort = (float) tektoplam / teksayac;
		System.out.println("Tek sayý ortalamasý="+tekort);
	}

}
