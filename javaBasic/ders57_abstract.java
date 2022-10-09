package javaNormal;

abstract class SoyutSinif{
	abstract void soyutMethod(); //// soyut içerisinde en az bir tane soyut method olmalýdýr
	
	void yaz() {  // soyut sýnýf içerinde somut methodlar olabilir
		System.out.println("Soyut sýnýf içinden yazdýrýldým");
	}
	
	public SoyutSinif() { // contructer tanmlanabilir
		// TODO Auto-generated constructor stub
	}
	
}


class Somutsinif extends SoyutSinif{
	void soyutMethod() { // eðer miras alýnmýþsa soyut method mutlaka override edilmelidir
		System.out.println("ben somut içinden override edildim");
	}
}


public class ders57_abstract {

	public static void main(String[] args) {
		// abstract - soyut sýnýf
		// soyut sýnýfýn nesnesi üretilemez
		// soyut içerisinde en az bir tane soyut method olmalýdýr
		// soy ut sýnýf içerinde somut methodlar olabilir
		// contructer tanmlanabilir
		
		Somutsinif ss = new Somutsinif();
		ss.soyutMethod();
		ss.yaz();
		

	}

}
