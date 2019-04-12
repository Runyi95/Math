package com.ryi.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface ListDH {
    public static int[] math() {

        BufferedReader[] buf = new BufferedReader[10];
        int n;
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            buf[i] = new BufferedReader(new InputStreamReader(System.in));

            do {
                n = 1;
                System.out.println("请输入第"+(i+1)+"个整数：");

                try {
                    array[i] = Integer.parseInt(buf[i].readLine());


                } catch (NumberFormatException e) {
                    System.out.println("数据输入错误请重新输入：");
                    n = 0;
                }catch (IOException e) {
                    e.printStackTrace();
                }

            } while (n == 0);
        }
        return array;

    }
    public static void print() {
        int[] ary = math();
        int m;
        System.out.println("\n你输入的数组是：");
        /**
         * 输出原数组
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(ary[i]+ "  ");

        }
        /**
         * 对换数组
         */
        for (int i = 0; i < 5; i++) {
            m = ary[i];
            ary[i] = ary[9-i];
            ary[9-i] = m;

        }
        System.out.println("\n对调后的数组是：");
        /**
         * 输出调换后的数组
         */
        for (int i = 0; i < 10; i++) {
            System.out.println(ary[i]+ "  ");
        }
        System.out.println();
    }

}
