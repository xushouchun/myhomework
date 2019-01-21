package homework.demo50;
/*
时间 ：  2019/1/1720:00

作用 ：
题目：猴子吃桃问题：猴子第一天摘下若干个桃子，
当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半
，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
程序分析：采取逆向思维的方法，从后往前推断。
基本思路 ：第一天吃了一一半-1

*/


import java.util.Scanner;

public class Demo17 {
    public static void main(String [] args){
//        第十天想吃剩下一个。也就是说第9天剩下 4个
//                1 4 9 19  a+1 *2
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入第几天");

        int day = sc.nextInt();
        int num=0;
        int taozi=1;
        for( int a =day ;a<10;a++){
//            这是天数
           taozi= (taozi+1)*2;
            num=taozi+num;

        }if (day<10){System.out.println("第"+day+"天桃子为"+num+"个");}
        if (day==10){
            System.out.println("第"+day+"天桃子为"+1+"个");
        }
        if(day>10){
            System.out.println("吃完了老铁");
        }

    }
}
