package homework.demo1;

import java.util.Scanner;

public class demo3 {

    //问题：3、要求用户输入一个年份和一个月份，判断（要求使用嵌套的if…else和switch分别判断一次）该年该月有多少天。
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int a = sc.nextInt();
        System.out.println("请输入一个月份");
        int b = sc.nextInt();
//    闰年
        if (a % 4 == 0) {
//        满足12个月
            if (1 <= b & b <= 12) {
//            闰年1357810 12 为31天
                if (b == 3 | b == 5 | b == 7 | b == 8 | b == 10 | b == 1 | b == 12) {
                    System.out.println("您输入的为闰年| 月份为31天");

                } else if (b == 2) {
                    System.out.println("您输入的为闰年|年份为29天");
                } else {
                    System.out.println("您输入的年份为闰年|月份为30天");
                }

            } else {
                System.out.println("您输入的月份有误");

            }
        } else if (a % 4 != 0) {
//        满足12个月
            if (1 <= b & b <= 12) {
//            闰年1357810 12 为31天
                if (b == 3 | b == 5 | b == 7 | b == 8 | b == 10 | b == 1 | b == 12) {
                    System.out.println("您输入的为平年| 月份为31天");

                } else if (b == 2) {
                    System.out.println("您输入的为平年|年份为29天");
                } else {
                    System.out.println("您输入的年份为平年|月份为30天");

                }
            } else {
                System.out.println("您输入的月份有误");
            }

        } else {
            System.out.println("您的输入有误");
        }
    }
}