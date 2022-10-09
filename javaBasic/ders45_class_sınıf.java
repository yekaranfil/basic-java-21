package javaNormal;

class Ogrenci{
	int ogrenci_numarasi;
	String ogrenci_ad;
	String ogrenci_soyad;
	
	void yaz(int n,String a,String s) {
		System.out.println(n + "-" + a + " " + s);
	}
	
}



public class ders45_class_sýnýf {

	public static void main(String[] args) {
		// Proje (Project)
		// ---Paket (Package)
		// ------Sýnýflar (Class)
		// ---------Methodlar
		
		Ogrenci o = new Ogrenci();
		o.ogrenci_numarasi=12;
		o.ogrenci_ad="Mustafa";
		o.ogrenci_soyad="Ercan";
		o.yaz(o.ogrenci_numarasi, o.ogrenci_ad, o.ogrenci_soyad);
		
		//harici java dosyasýndan sýnýf nesnesi oluþturalým
		OgrenciNot on = new OgrenciNot();
		on.ogrenci_numarasi=12;
		on.v = 78;
		on.f = 52;
		
		System.out.println(on.ortalama(on.v, on.f));
		
	}

}
