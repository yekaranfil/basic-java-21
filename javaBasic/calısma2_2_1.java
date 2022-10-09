package javaNormal;

import java.util.Random;

public class calýsma2_2_1 {
    public static void main(String[] args) {
        Random r = new Random();
        char harf;
        int sayi;
        String toplam = "";
        String[] dizi = new String[20];


        for (int i=0;i<20;i++){
            toplam = "";

            for(int j=0; j<3; j++) {

                sayi = r.nextInt(25)+97;

                harf = (char) sayi;
                toplam += harf;



            }
            dizi[i] = toplam;
            System.out.print(dizi[i]+"-");
        }



    }
}
