package net.dzirt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Андрей on 13.03.2017.
 * Babylon square root finding method
 */
public class SquareRoot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(reader.readLine());
        double x1 = 1;
        double x2 = num / x1;
        int i = 0;
        double eps = 0.000000000000001;
        while (Math.abs(x1-x2) > eps) {
            System.out.println(i+ " : " +x1);
            i++;
            x1 = (x1+x2)/2;

            x2 = num/x1;
        }
    }

}
