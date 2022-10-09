package javaNormal;

import java.util.Scanner;

public class calýsma2_3 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int[][] matris = new int[3][3];
        //System.out.println("Bir matris sayýsý giriniz :");
        //matris[0][0] = girdi.nextInt();
        //System.out.println("bir matris sayýsýný giriniz : ");
        //matris[0][1] = girdi.nextInt();
        //System.out.println("bir matris sayýsýný giriniz : ");
        //matris[0][2] = girdi.nextInt();
        //System.out.println("bir matris sayýsýný giriniz : ");
        //matris[1][0] = girdi.nextInt();
        //System.out.println("bir matris sayýsýný giriniz : ");
        //matris[1][1] = girdi.nextInt();
        //System.out.println("bir matris sayýsýný giriniz : ");
        //matris[1][2] = girdi.nextInt();
        //System.out.println("bir matris sayýsýný giriniz : ");
        //matris[2][0] = girdi.nextInt();
        //System.out.println("bir matris sayýsýný giriniz : ");
        //matris[2][1] = girdi.nextInt();
        //System.out.println("bir matris sayýsýný giriniz : ");
        //matris[2][2] = girdi.nextInt();
        for(int i=0;i<4;i++){
            for(int j =0;j<3;j++){
                System.out.println("bir sayý giriniz :");

                matris[i][j] = girdi.nextInt();
            }
            System.out.println("\n");
            for(int x=0;x<2;x++){
                for(int j=0;j<3;j++) {
                    System.out.print(matris[i][j]+"\t"+"");

                }
            }

        }






        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matris[j][i]+"-");
            }

        }
        System.out.print(matris[3][3]);


















    }
}
