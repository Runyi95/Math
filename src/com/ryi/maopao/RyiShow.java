package com.ryi.maopao;


import com.ryi.math.ListDH;


public class RyiShow implements bubbleSort,ListDH {
    public static void main(String[] args)
    {
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        System.out.print("排序前：");
        bubbleSort.printArr(numbers);

/**
 * 冒泡算法
 */
        bubbleSort.bubbleSorts(numbers);
        System.out.print("冒泡排序后：");
        bubbleSort.printArr(numbers);
/**
 *s数组对换
 */
       // ListDH.print();


    }
}
