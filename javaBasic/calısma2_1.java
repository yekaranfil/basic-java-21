package javaNormal;

import java.util.Random;

public class calýsma2_1 {
    public static void main(String[] args) {
        Random r = new Random();
    int[] dizi = new int[20];
    int ucetam,dortetam,toplam1,toplam2;
    ucetam=dortetam=toplam1=toplam2=0;
        for (int i=0;i<dizi.length;i++) {
            dizi[i] = r.nextInt(1000+8999);
            System.out.print(dizi[i]+"-");
            if(dizi[i]%3==0) {
                ucetam++;
                toplam1 += dizi[i];
            }
            else if (dizi[i]%4==0){
                dortetam++;
                toplam2 += dizi[i];

            }

        }
        System.out.println();
        System.out.print("Üçe tam bölünenlerin adeti="+ucetam);
        System.out.println();
        System.out.print("üçe tam bölünenler toplamý = "+toplam1);
        System.out.println();
        System.out.print("Dörde tam bölünenler toplamý = "+toplam2);
        System.out.println();
        System.out.println("Dörde tam bölünenlerin adeti = "+dortetam);
        System.out.println();
        int sonuc = toplam1-toplam2;
        System.out.println("Aradaki farký = "+sonuc);





    }
}
