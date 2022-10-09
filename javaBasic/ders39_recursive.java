package javaNormal;

public class ders39_recursive {
	
	static int faktoriyel(int s) {
		if(s>1) {
			return s*faktoriyel(s-1);
		} else return 1;
	}
	

	public static void main(String[] args) {
		// Recursive - Özyinelemeli
		System.out.println(faktoriyel(4));

	}

}
