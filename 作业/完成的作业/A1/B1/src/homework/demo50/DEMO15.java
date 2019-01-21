package homework.demo50;
/*
时间 ：  2019/1/1719:06

作用 ：题目：输入三个整数x,y,z，请把这三个数由小到大输出。
程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，
然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。

基本思路 ：
*/

import java.util.Scanner;

public class DEMO15 {
    public static void main(String[] args) {
//        初始化
        int t = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int one = sc.nextInt();

        System.out.println("请输入第二个整数");
        int two = sc.nextInt();

        System.out.println("请输入第三个整数");
        int three = sc.nextInt();


        if (one > two) {
            t = one;
            one = two;
            two = t;
        }
        if (one > three) {
            t = one;
            one = three;
            three = t;
        }
        if (two > three) {
            t = two;
            two = three;
            three = t;
        }
     System.out.println( "第一个数"+one + "第二个数"+two +"第三个数"+three);


    }


}
