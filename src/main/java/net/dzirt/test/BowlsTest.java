package net.dzirt.test;

import java.util.*;

import static java.lang.Math.abs;

/**
 * Created by Андрей on 24.03.2017.
 */
public class BowlsTest {

    public static Float getPS(int x, int y, int i) {
        //Float result = 90.0f;
        Float result = y/(1-(1/90.0f*abs(x-i)));

        //long  = Math.round(res);
        if((result < 8*54)&&(abs(x-i)<90)) {
            return result;
        }
        return 432.0f;
    }
    public static void main(String[] args) {
        int x1 = 20;
        int x2 = 40;
        int x3 = 60;
        int x4 = 200;

        int y1 = 20;
        int y2 = 20;
        int y3 = 20;
        int y4 = 20;
        List<Float> r1 = new ArrayList<Float>();
        List<Float> r2 = new ArrayList<Float>();
        List<Float> r3 = new ArrayList<Float>();
        List<Float> r4 = new ArrayList<Float>();

        List<Float> result = new ArrayList<Float>();

        for (int i = 0; i < 200; i++) {
            r1.add(getPS(x1,y1,i));
            r2.add(getPS(x2,y2,i));
            r3.add(getPS(x3,y3,i));
            r4.add(getPS(x4,y4,i));

            result.add(r1.get(i) + r2.get(i) + r3.get(i) + r4.get(i));
        }
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(result);

        for (int i = 0; i < 200; i++){
            System.out.print(Math.round(result.get(i))+", ");

        }

        List<Float> minimums = new ArrayList<Float>();
        List<Integer> minNums = new ArrayList<Integer>();
        for (int i = 1; i < 200-1; i++){
            if((result.get(i)<result.get(i+1))&&(result.get(i)<result.get(i-1))){
                minimums.add(result.get(i));
                minNums.add(i);
            }
        }


        System.out.println(minNums);
        System.out.println(minimums);

//
//        ArrayList<Integer> xs = new ArrayList<Integer>();
//        for (int i = 0; i < 200; i++) {
//            xs.add(i);
//        }
//
//        ArrayList<Long> ys = new ArrayList<Long>();
//        for (int i = 0; i < 200; i++) {
//           ys.add(r1.get(i));
//        }


        Up7 view = new Up7();
        view.showFrame();


    }
}
