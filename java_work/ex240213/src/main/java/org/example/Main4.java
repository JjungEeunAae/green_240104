package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main4 {
    public static int doSum(Predicate<Integer> p, List<Integer> list) {
        int s = 0;

        for(int i : list) {
           if(p.test(i)) {
               s += i;
           }
        }

        return s;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,8,7,9,12,24);
        int sum = 0;

        sum = doSum(item -> item % 2 == 0, list);
        System.out.println("짝수의 합 = " + sum);

        sum = doSum(item -> item % 2 != 0, list);
        System.out.println("홀수의 합 = " + sum);

        sum = list.stream().mapToInt(integer -> integer).sum();
        System.out.println(sum);

        sum = list.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(integer -> integer)
                .sum();
        System.out.println(sum);

    };
}
