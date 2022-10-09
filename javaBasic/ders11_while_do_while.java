package javaNormal;

public class ders11_while_do_while {

	public static void main(String[] args) {
		// while döngüsü
		int sayac = 0;
		
		while (sayac<10) {
			//System.out.println("Döngünün " + sayac + ". adýmý");
			sayac++;
		}
		
		//sonsuz döngü
		//while(true) {
			
		//}
		
		//while(1<1) {
			
		//}
		
		//do-while
		int i = 100;
		do {
			System.out.print( i + "-");
			i-=5;
		} while (i>0);

	}

}
