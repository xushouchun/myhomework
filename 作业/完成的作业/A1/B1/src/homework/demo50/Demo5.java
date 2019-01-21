package homework.demo50;
/*
时间 ：  2019/1/1713:37

作用 ：题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
程序分析：(a>b)?a:b这是条件运算符的基本例子。

基本思路 ：
*/

import java.util.Scanner;
public class Demo5 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
//        创建接受数据
        while (true) {
            System.out.println("请输入您的成绩");

            int chengji = sc.nextInt();

            if (chengji >= 90 & chengji <= 100) {
                System.out.println("您好您的成绩为A");

            } else if (chengji >= 60 & chengji < 90) {
                System.out.println("您好您的成绩为b");
            } else if (chengji < 60 & chengji >= 0) {
                System.out.println("您好 您的成绩为c");

            } else {
                System.out.println("请输入成绩100-0之间进行判断");

            }


        }

    }

}
