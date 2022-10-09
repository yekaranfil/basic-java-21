package javaNormal;

import java.util.Random;

public class calýsma2_2 {
    public static void main(String[] args) {
        Random r = new Random();
        String[] dizi = new String[20];
        int[] rast = new int[20];
        for(int i=0;i<rast.length;i++) {
            rast[i] = r.nextInt(26)+96;
            System.out.print(rast[i]+"-");
        }
        System.out.println();
        for(int i=0;i< rast.length;i++) {
            System.out.print((char)rast[i]+"-");

        }



    }
}
