package javaNormal;

import java.util.ArrayList;

public class Goldbach {
	
	static boolean asalMi(int s) {
		int bolenSayac=0;

		if(s>1) {
			for(int i=2;i<s;i++) {
				if(s%i==0) bolenSayac++;
			}

			if(bolenSayac==0) return true;
			else return false;
		} else return false;

	}
	
	ArrayList<Integer> asalListe(int s){
		ArrayList<Integer> liste = new ArrayList<>();
		
		for(int i=0;i<s;i++) {
			if(asalMi(i)) liste.add(i);
		}
		
		return liste;
	}
	
	String goldbachCiftleri(int s,ArrayList<Integer> asallar) {
		String ciftler="";
		int i,j;
		
		for(i=0;i<asallar.size();i++) {
			for(j=0;j<asallar.size();j++) {
				if(asallar.get(i)+asallar.get(j)==s) {
					ciftler += Integer.toString(asallar.get(i))+"+"+Integer.toString(asallar.get(j))+"\n";
				}
			}
		}
		
		return ciftler;
	}
}
