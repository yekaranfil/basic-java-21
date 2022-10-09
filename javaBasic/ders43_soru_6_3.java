package javaNormal;

public class ders43_soru_6_3 {
	static int kuvvetAl(int taban,int us) {
		int sonuc=1;
		for(int i=0;i<us;i++) sonuc *= taban;
		return sonuc;
	}

	public static void main(String[] args) {
		// Kendisine gönderilen sayý ve üs deðerlerine göre kuvvet alan methodu yazýnýz? (Math.Pow() fonksiyonunu yazacaksýnýz kýsaca)
		System.out.println(kuvvetAl(5,3));
	}

}
