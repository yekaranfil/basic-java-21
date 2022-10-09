package javaNormal;

import java.util.Scanner;

public class calýsma1 {

    public static void main(String[] args) {
    int a,b,c,toplam;
    float ortalama = 0;
    Scanner tara = new Scanner(System.in);

    System.out.println("1. sayýyý giriniz");
    a = tara.nextInt();
    System.out.println("2. sayýyý giriniz");
    b = tara.nextInt();
    System.out.println("3. sayýyý giriniz");
    c = tara.nextInt();

    if (a>b && b>c) // en büyük A en küçük c ise
        ortalama = (float)(a+c)/2;
    else if (a>c && c>b) // en büyük a en küçük b ise
        ortalama = (float)(a+b)/2;
    if (b>a && a>c)
        ortalama = (float)(b+c)/2; //en büyük b en küçük c ise
    else if (b>c && c>a)
        ortalama = (float)(b+a)/2;  // en büyük b en küçük a ise
    if (c>a && a>b) // en büyük c en küçük b ise
        ortalama = (float)(c+b)/2;
    else if (c>b && b>a) // en büyük c en küçük a ise
        ortalama = (float)(c+a)/2;

    System.out.println("Sonucunu : "+ortalama);

    }
}
