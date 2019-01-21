package homework.demo50;
/*
时间 ：  2019/1/1715:54

作用 ：题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？

基本思路 ：意思就是100 每次截取一半。
多少米
100+50   50 +25   25 + 25/2
1              2     3


*/


import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        int gaodu = 200;
        int gaodu1=100;
        int gaodu3=100;
        int cishu = 0;
        int num = 0;
        int num1 = 0;
        int num2=0;
        int num3=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请告诉我你跳了几次");
        int count = sc.nextInt();
        for (int a = 1; a <= count; a++) {
           gaodu=gaodu/2;
           num=num+gaodu;

        }
        for (int a = 1; a < count; a++) {
            gaodu1=gaodu1/2;
            num1=num1+gaodu1;

        }
        num2=num1+num2;
        for (int a = 1; a <=count; a++) {
            gaodu3 = gaodu3 / 2;


        }


        System.out.println("共经历了"+num2+"米第"+count+"次回弹高度为"+gaodu3);

    }
}
