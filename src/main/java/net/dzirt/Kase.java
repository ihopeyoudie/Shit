package net.dzirt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Андрей on 18.03.2017.
 */
public class Kase {
    public static void main(String[] args) throws IOException {
        //int x=6 ;
       // int y=7 ;
        int z;
        //System.out.println(z);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите k: ");
        int k = Integer.parseInt(reader.readLine());//Ввод с клавиатуры целочисл. перем. k
        System.out.print("Введите p: ");
        int p = Integer.parseInt(reader.readLine());
        z = k + p;
        System.out.println(" Сумма= "+z);



}
}
