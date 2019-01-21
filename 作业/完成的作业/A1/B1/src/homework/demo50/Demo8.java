package homework.demo50;
/*
时间 ：  2019/1/1715:02

作用 ：题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
程序分析：关键是计算出每一项的值。

基本思路 ：
*/

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        int a = 0;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            a = a * 10+2;
            num =a+num;
        }System.out.println(num);


    }

}
