package javaNormal;

public class ders33_methodlar {
	
	// bu metot deðer döndürmez, deðer almaz
	// deðer döndürmeyen metotlar void önekini alýrlar
	static void yaz() {
		System.out.println("Ben metot tarafýndan yazdýrýldým!");
	}
	
	// deðer döndürmeyen deðer alan metotlar
	static void hosgeldin(String isim) {
		System.out.println("Hoþgeldin "+ isim);
	}
	
	//deðer alan ve deðer döndüren methodlar
	// deðer döndüren metotlarda void yazýlmaz, döndüreceði deðerin tipi yazýlýr
	static int topla(int a,int b) {
		return a + b;
	}

	
	public static void main(String[] args) {
		// Method - Metot
		//fonksiyonlarýn aynýsý
		//her java dosyasý bir sýnýf-class dosyasýdýr
		//bu dosyalar main method ile baþlar
		// main den baþka methodlar yazýlabir.
		yaz();
		hosgeldin("Alper");
		System.out.println(topla(45, 34));
	}

}
