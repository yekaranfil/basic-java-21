package javaNormal;

class StaticAttr{
	static int a = 10; // static attributeler için nesne oluþturmaya gerek yoktur

	static int kuvvetAl(int taban,int us) {
		int sayi = 1;
		for(int i=0;i<us;i++) sayi *= taban;
		
		return sayi;
	}
	
	static void aDegeriYaz() {
		System.out.println(a);
	}
	
}



public class ders51_staticDeyimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StaticAttr sa = new StaticAttr();
		// sa.a;
		
		// static ön eki var
		System.out.println(StaticAttr.a);
		System.out.println(StaticAttr.kuvvetAl(3, 3));
		
		StaticAttr.a = 30;
		System.out.println(StaticAttr.a);
		
		StaticAttr.aDegeriYaz();
		
	}

}
