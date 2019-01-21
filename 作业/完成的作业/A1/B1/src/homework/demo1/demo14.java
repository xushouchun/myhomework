package homework.demo1;
//14、编写Java程序，从键盘输入一个整数保存在月份变量month中，使用switch语句实现判断月份month有几天并输出，不用考虑闰年。

import java.util.Scanner;

public class demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int a = sc.nextInt();
        if (1 <= a & a <= 12) {
            switch (a) {
                case 1:
                    System.out.println("这个月份为31天");
                    break;
                case 2:
                    System.out.println("这个月份为28天");
                    break;
                case 3:
                    System.out.println("这个月份为31天");
                    break;
                case 5:
                    System.out.println("这个月份为31天");
                    break;
                case 7:
                    System.out.println("这个月份为31天");
                    break;
                case 8:
                    System.out.println("这个月份为31天");
                    break;
                case 10:
                    System.out.println("这个月份为31天");
                    break;
                case 12:
                    System.out.println("这个月份为31天");
                    break;
                default: {
                    System.out.println("这个月份为30天");

                }
            }


        } else
            System.out.println("没有这个月份变量");
    }

}




