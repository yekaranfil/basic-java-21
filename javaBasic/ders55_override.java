package javaNormal;

class Anasinif{
	void yaz() {
		System.out.println("Superclass'taki yaz metotundan");
	}
}

class Altsinif extends Anasinif{
	void yaz() {
		System.out.println("Altsýnýfta override edilen methodtan");
	}
}

public class ders55_override {

	public static void main(String[] args) {
		// override miras alýnan sýnýftaki bir methodun iptal edilmesidir
		// @overrited
		Anasinif as = new Altsinif();
		as.yaz();
		Anasinif a = new Anasinif();
		a.yaz();

	}

}
