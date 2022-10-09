package javaNormal;

import java.util.ArrayList;
import java.util.Scanner;

public class ss {
    static int hesapla(int s) {
        ArrayList<Character> liste = new ArrayList<>();
        String metin = "";
        metin += s ;
        for(int i=0;i<metin.length();i++) {
            liste.add((char) s);


        }
        liste.add((char) s);
        System.out.println(metin);
        System.out.println(liste);
        return s;

    }

    public static void main(String[] args) {



     Scanner scan = new Scanner(System.in);
     System.out.println("bir karakter dizisi deðeri giriniz:");
     int a = scan.nextInt();
     hesapla(a);


    }



}
