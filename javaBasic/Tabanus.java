package javaNormal;

public class Tabanus {

	String tabanBul(int sayi,int taban) {
		String s="";
		String ters="";
		int i=0;
		
		if(sayi<taban) {
			s = Integer.toString(sayi);
		} else if(sayi==taban) {
			s = "10";
		} else {
			
			while(true) {
			s += Integer.toString(sayi%taban);
			sayi = sayi - (sayi%taban);
			sayi = sayi/taban;
			if(sayi<taban) {
				s += Integer.toString(sayi);
				for(i=s.length()-1;i>=0;i--) ters += s.charAt(i);
				s = ters;
				break;}
			}
		}
		
		
		return s;
	}
	
}
