package homework.demo50;
/*
时间 ：  2019/1/1716:36

作用 ：题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，
可提成3%；60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，
超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。

基本思路 ：
*/

import java.util.Scanner;
public class Demo12 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double jiangjin=0;
        double lirun=sc.nextDouble();
        System.out.println("请告诉我您这个月的月收益");
        if (lirun<=10){
            jiangjin=lirun*0.1;
        }else if (lirun<20&&lirun>10){
//            利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
            jiangjin=lirun*0.1;

        }




    }
}
