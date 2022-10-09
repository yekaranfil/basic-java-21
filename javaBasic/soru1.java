package javaNormal;

import java.util.ArrayList;

import java.util.Random;

public class soru1 {




    static ArrayList<String> metot(ArrayList<Integer> sayi) {

        ArrayList<String> array = new ArrayList<String>();

        String string = "";

        for (int i = 0; i < sayi.size(); i++) {

            int a = sayi.get(i);

            string += (char) a;

        }

        array.add(string);

        string = "";

        return array;

    }


    public static void main(String[] args) {

        Random r = new Random();

        ArrayList<Integer> sayi = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {

            sayi.add(r.nextInt(26) + 65);

        }

        System.out.println(metot(sayi));


    }


}