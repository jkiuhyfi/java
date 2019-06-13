package array工具类;

import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {
        int[] p = {1, 23, 4};
        //排序
        Arrays.sort(p);
        for (int i = 0; i < 3; i++) {
            System.out.println("排序" + p[i]);
        }
        //查找
        int search = Arrays.binarySearch(p, 23);
        System.out.println(search);
        //复制
        int[] ints = Arrays.copyOfRange(p, 1, 5);
        for (int i = 0; i < ints.length; i++) {
            System.out.println("--" + ints[i]);
        }

        //替换所有
        Arrays.fill(p, 888);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }

    }
}
