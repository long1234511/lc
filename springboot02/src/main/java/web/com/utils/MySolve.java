package web.com.utils;

import java.util.*;

/**
 * @version V1.0.1
 * @classname MySolve
 * @description:
 * @author: longcong
 * @email: longcong@aliyun.com
 * @date: 2018-12-24  17:45
 **/
public class MySolve {
/*
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for(int i=0;i<n;i++) {
                nums[i] = in.nextInt();
            }
            int[] res = solve(nums);
            for(int i=0;i<res.length-1;i++) {
                System.out.print(res[i] + " ");
            }
            System.out.print(res[res.length-1]);
        }

    }

    private static int[] solve(int[] nums) {

        Set<Integer> set = new LinkedHashSet<>();

        for(int i=nums.length-1;i>=0;i--) {
            set.add(nums[i]);
        }

        int[] res = new int[set.size()];

        Iterator<Integer> it = set.iterator();

        int i = res.length-1;
        while(it.hasNext()) {
            res[i] = it.next();
            i--;
        }
        return res;
    }*/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    Set<String> set = new HashSet<>();
        while (in.hasNext()){
            int a1 = in.nextInt();
            int a2 = in.nextInt();
            int a3 = in.nextInt();
            list.add(a1);
            list.add(a2);
            list.add(a3);
            break;
        }
        for (Integer integer : list) {
            System.out.println("    =: "+ integer);

        }

       //  System.out.println(next);
    }

}
