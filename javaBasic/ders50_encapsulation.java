package javaNormal;

class Sinif{
	private int a = 10;
	private String b = "algoritma";
	private char c = 'x';
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	
	private void yaz() {
		System.out.println("Algoritmayý çok seviyorum!");
	}
	
	public void getYaz() {
		yaz();
	}
	
}


public class ders50_encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sinif s = new Sinif();
		System.out.println(s.getA());
		s.setA(25);
		System.out.println(s.getA());
		
		s.getYaz();
		
	}

}
