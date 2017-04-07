package net.dzirt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Xenia on 16.03.2017.
 */

public class Speisekarte {

    public static void main(String[] args) throws IOException {
        String w = "Введите имя: ";
        //System.out.println(w + "\n"+ w);
        System.out.println(w);
/*
        int x = 3;
        int y = 4;
        int z = x*x - 4*y;
        System.out.println(z);
        x = 2;
        y = 5;
        z = x*x - 4*y;
        System.out.println(z);
        x = 7;
        y = 12;
        z = x*x - 4*y;
        System.out.println(z);
*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imya = reader.readLine();

        System.out.println("Привет, "+imya);


        String d = reader.readLine();
        System.out.println("Введите возраст, "+d);

    }
}

