package homework.demo1;

import java.util.Scanner;

public class demo1 {

    //1、要求用户输入一个年份，判断并输出该年份是闰年还是平年。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int a = sc.nextInt();

        if (a % 4 == 0 ) {
            System.out.println("您输入的年份为闰年");


        } else if (a % 4 != 0  ) {
            System.out.println("您输入的年份为平年");


        } else {
            System.out.println("您输入的有误，请重新输入");

        }
    }

}

