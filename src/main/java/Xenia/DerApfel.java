package Xenia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Андрей on 18.03.2017.
 */
public class DerApfel {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите x: ");
        int x = Integer.parseInt(reader.readLine());//Ввод с клавиатуры целочисл. перем. k
        System.out.print("Введите y: ");
        int y = Integer.parseInt(reader.readLine());
        System.out.print("Введите z: ");
        int z = Integer.parseInt(reader.readLine());//Ввод с клавиатуры целочисл. перем. k
        int r = x * y - z ;
        System.out.println(" Результат  =   "+r);
    }
}
