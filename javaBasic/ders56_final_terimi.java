package javaNormal;

final class Durum {
	final float pisayisi = (float) 3.14;
}

/*class Yenidurum extends Durum{ //final sýnýf miras vermez
	
} */

class Hesapla{
	final void ivme() {
		//v=at^2
	}
}

/*class YeniHesap extends Hesapla{
	void ivme() {   // superclass taki ivme metodu override edilemez
					// ivme hesaplama yöntemini kilitlyoruz
	}
}*/

public class ders56_final_terimi {

	public static void main(String[] args) {
		// Final terimi bir niteliðin en son halini temsil
		// final olarak tanýnlanan bir sýnýfýn altsýnýfý oluþturulamaz
		// final olarak oluþtuluan method ise override edilemez
		// final olarak deðiþken oluþturduysanýz deðer bir kere atanabilir ve deðiþtirilemez
		Durum d = new Durum();
		// d.pisayisi=3; pisayýsýna yeni bir deðer atamnýzý engeller
	}

}
