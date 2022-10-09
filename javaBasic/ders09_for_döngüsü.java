package javaNormal;

public class ders09_for_döngüsü {

	public static void main(String[] args) {
		// for döngüsü
		int i;

		for(i=0;i<10;i++) {  // ++ birer artýrýr
			//System.out.print(i+"-");  //println alt alta yazar - print yanyana yazar
		}

		//0 - 250'ye kadar olan ve 7'ye bölünen sayýlarý yazdýralým
		for(int j=0;j<250;j++) {
			if(j%7==0) {
				//System.out.print(j + " - ");
			}
		}

		//tersine döngü
		for(i=10;i>0;i--) { //-- birer azaltýr
			//System.out.print(i+" - ");
		}

		//atlamalý döngü
		for(i=0;i<500;i+=10) { 
			//System.out.print(i+" - ");
		}

		//tersine atlamalý döngü
		for(i=100;i>0;i-=13) { //-- birer azaltýr
			System.out.print(i+" - ");
		}



	}

}
