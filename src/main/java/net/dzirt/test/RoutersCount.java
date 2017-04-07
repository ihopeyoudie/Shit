package net.dzirt.test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Андрей on 23.03.2017.
 */
public class RoutersCount {
    public static void main(String[] args) {
        int N = 6;
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= N; i++) {
            set.add(i);
        }
        System.out.println(set);
        int count = 0;
        for (int i = 1; i <= N; i++) {
            Set<Integer> t = new HashSet<Integer>(set);
            Set<Integer> toRemove = new HashSet<Integer>();
            toRemove.add(i);
            t.removeAll(toRemove);
            System.out.println("1 ----- 1: " +toRemove + "    2: " + t);
            System.out.println();

            count++;

            for(int j = i + 1; j <= N; j++) {
                t = new HashSet<Integer>(set);
                toRemove.add(i);
                toRemove.add(j);
                t.removeAll(toRemove);
                System.out.println("2 ----- 1: " +toRemove + "    2: " + t);
                System.out.println();
                //System.out.println(" -- " + t);
                count++;
                for(int k = j + 1; k <= N; k++) {
                    t = new HashSet<Integer>(set);
                    toRemove.add(i);
                    toRemove.add(j);
                    toRemove.add(k);
                    t.removeAll(toRemove);
                    System.out.println("3 ----- 1: " +toRemove + "    2: " + t);
                    System.out.println();
                    //System.out.println(" -- " + t);
                    count++;
                }
                toRemove.clear();
                System.out.println("-----------------------------------------------");
            }
            toRemove.clear();
            System.out.println("-----------------------------------------------");
        }
        System.out.println(count);
    }

    public static void perebor (Set s) {

    }
}
