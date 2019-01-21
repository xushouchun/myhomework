package Adianpu;
/*
时间 ：  2019/1/1712:44

作用 ：

基本思路 ：
*/


import java.util.Scanner;

public class Cs3 {
    public static void main(String[] args) {
//        初始化
        int[] a = new int[5];

       int max=a[0];

        Scanner sc = new Scanner(System.in);
        for (int b = 0; b <a.length; b++) {
            System.out.println("请输入第" + b + "个元素的值");
            int c = sc.nextInt();
            a[b] = c;

        }
//        开始遍历数组对比
        System.out.println("结果是");
        for (int d = 0; d <a.length; d++) {
            if (a[d] > max) {
                max = a[d]
                ;
                System.out.println(max);
            }

        }
    }

}
