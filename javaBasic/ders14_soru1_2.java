package javaNormal;

public class ders14_soru1_2 {

	public static void main(String[] args) {
		// 0 ile 100 arasýndaki 4 bölünen sayýlarýnýn toplamýný bulunuz?
		int toplam=0;
		for(int i=0;i<100;i++) {
			if(i%4==0) {
				toplam += i;
			}
		}
		
		System.out.println("Dörte bölünenlerin toplamý = " + toplam);
		
	}

}
