package javaNormal;

public class ders15_soru1_3 {

	public static void main(String[] args) {
		// 50 ile 250 arasýndaki çift sayýlarýn toplamýný bulunuz?
		int toplam = 0;
		
		for(int i=50;i<250;i++) {
			if(i%2==0) {
				toplam+=i;
			}
		}
		
		System.out.println("Çift sayýlarýn toplamý="+toplam);
		

	}

}
