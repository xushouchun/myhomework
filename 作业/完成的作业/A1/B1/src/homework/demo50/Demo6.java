package homework.demo50;
/*
时间 ：  2019/1/1713:47

作用 ：题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
程序分析：利用辗除法。
：12、16的公约数有1、2、4，其中最大的一个是4，4是12与16的最大公约数，一般记为（12，16）=4。12、15、18的最大公约数是3，记为（12，15，18）=3。
基本思路 ：
*/


import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int x = sc.nextInt();
        System.out.println("请输入第二个正整数");
        int y
                = sc.nextInt();
//现在求这个数的最大公约数


            int t, k = 1;
            if (x < y) {
                t = x;
                x = y;
                y = t;
            }
            for (int i = y; i >= 1; i--) {
                if (x % i == 0) {
                    k = i;
                    break;
                }
            }

        }


    }



