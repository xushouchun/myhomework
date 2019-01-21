package homework.demo1;
//13、由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else),并且从小到大输出

import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个值");
        int a = sc.nextInt();
        System.out.println("请输入第二个值");
        int b = sc.nextInt();
        System.out.println("请输入第三个值");
        int c = sc.nextInt();
        if (a > b & b > c) {

            System.out.println("最大数为：" + a + "中间数：" + b + "最小数为：" + c);
        } else if (a > c & c > b) {
            System.out.println("最大数为：" + a + "中间数：" + c + "最小数为；" + b);

        } else if (b > c & c > a) {
            System.out.println("最大数为：" + b + "中间数：" + c + "最小数为：" + a);


        } else if (c > a & a > b) {
            System.out.println("最大数为：" + c + "中间数：" + a + "最小数为：" + b);

        } else if (c > a & b > a) {
            System.out.println("最大数为：" + c + "中间数：" + b + "最小数为：" + a);
        }else{
            System.out.println("您的输入有误" );
        }
    }
}




