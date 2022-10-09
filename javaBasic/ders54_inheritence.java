package javaNormal;

class Kuslar{
	int boy ;
	int agirlik;
	int kanat;
}

class Yirtici extends Kuslar{
	int ucus_yuksekligi;
}

class Kartal extends Yirtici{
	String  tur;
}

class Dogan extends Yirtici{
	
}

class Sahin extends Yirtici{
	String goz;
}

class Ucamayanlar extends Kuslar{
	
}



public class ders54_inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kartal k = new Kartal();
		k.kanat=100;

		Ucamayanlar u = new Ucamayanlar();
		u.kanat=10;

		Sahin s = new Sahin();

		
		
	}

}
