package javaNormal;

public class calýsma4 {

    public static void main(String[] args) {
        int i;
        int a = 100;
        int b = 101;
        int c;
        System.out.print(a + "-" + b + "-");
        for (i = 100; i < 10000; i++) {
            c = a + b;
            System.out.print(c + "-");
            a = b; // yeni a ve b deðerlerini kaydýrýyoruz
            b = c;
        }
    }

}
