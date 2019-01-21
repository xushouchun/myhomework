package homework.demo1;
//16、编写程序，设计一个图形面积计算，选择不同的图形输入数字计算面积，选择4退出程序。

import java.util.Scanner;

public class demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您需要计算面积的图像 1.矩形 2.三角形  3.圆形");

        int a = sc.nextInt();

        double z;
        int e;
        if (a == 1) {
            System.out.println("请输入矩形的：宽");
            int b = sc.nextInt();
            System.out.println("请输入矩形的：高");
            int c = sc.nextInt();
            if (b > 0 & c > 0) {
                e = b * c;
                System.out.println("您计算的矩形面积为" + e);


            } else {
                System.out.println("您输入的数值必须为正整数");

            }


        } else if (a == 2) {
            System.out.println("请输入三角形的：宽");
            int b = sc.nextInt();
            System.out.println("请输入三角形的：高");
            int c = sc.nextInt();
            if (b >0 & c > 0) {
                e = (b * c) / 2;
                System.out.println("您计算的三角形面积为" + e);
            } else {
                System.out.println("您输入的数值必须为正整数");
            }


        } else if (a == 3) {
            System.out.println("请输入圆形的：半径");
            int b = sc.nextInt();
            if (b > 0 ){
                double w = b * b*3.1415926;
                System.out.println("您计算的三角形面积为" + w);
            } else {
                System.out.println("您输入的数值必须为正整数");
            }
        }
    }
}
