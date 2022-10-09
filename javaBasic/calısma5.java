package javaNormal;

import java.util.ArrayList;
import java.util.Random;

public class calýsma5 {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        ArrayList<String> liste2 = new ArrayList<>();
        Random r = new Random();
        int i;
        int sayi;
        char x;
        String y;
        for (int j = 0; j < 100; j++) {

            for (i = 0; i < 3; i++) {
                sayi = r.nextInt(26) + 97;
                x = (char) sayi;
                String s = String.valueOf(x);
                liste2.add(s);
                //System.out.print(x);

            }



        }
        //System.out.println(liste2);
        for(int z=0;z<3;z++) {
            for( String v : liste2) {
                System.out.println(v);
            }
        }


    }
}
