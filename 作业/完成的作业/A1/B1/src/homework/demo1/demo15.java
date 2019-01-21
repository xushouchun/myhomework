package homework.demo1;
//15、输入数量不确定的正数和负数（一次输入一个），然后打印整数和负数的个数，当输入0时，程序停止

import java.util.Scanner;

public class demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int z = 0;
        int f = 0;
        while (true) {
            System.out.println("请输入数值");
            int a = sc.nextInt();

            if (a > 0) {

                z++;

            } else if (a < 0) {
                f++;
            } else {
                return;
            }
//
            System.out.println("目前正整数为" + z + "负整数" + f);
        }

    }
}


