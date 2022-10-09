package javaNormal;

class Kup{
	int en,boy,yukseklik;
	
	//constructer methodlarýn ismi sýnýf ismi ayný olur
	Kup(){
		en = boy = yukseklik = 10;
	}
	
	//constructer methodlar overload edilebilir.
	Kup(int e,int b,int y){
		this.en = e;
		this.boy = b;
		this.yukseklik = y;
	}
}



public class ders46_constructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kup k = new Kup(); //constructer çalýþýr		
		System.out.println(k.en+"-"+k.boy+"-"+k.yukseklik);	
		
		k.en = 25;
		System.out.println(k.en+"-"+k.boy+"-"+k.yukseklik);	
		
		Kup k2 = new Kup(20,30,40);
		System.out.println(k2.en+"-"+k2.boy+"-"+k2.yukseklik);	
	}

}
