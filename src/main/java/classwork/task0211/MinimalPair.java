package classwork.task0211;

import java.util.ArrayList;
import java.util.Random;

public class MinimalPair {
    public static void main(String[] args) {
        int sum;
        ArrayList<Integer> arr = new ArrayList<>();
        Random rand = new Random();
        int min_inx = -1;
        int min_sum= Integer.MAX_VALUE;
        for (int i = 0; i <30 ; i++) {
            arr.add(rand.nextInt(101));
        }
        for (int i = 0; i <29 ; i++) {
            sum = arr.get(i + 1) + arr.get(i);
            if (sum < min_sum) {
                min_inx = i;
                min_sum = sum;
            }
        }
        System.out.println(arr);
        System.out.println(min_inx);
            System.out.println(min_sum);

    }
}
