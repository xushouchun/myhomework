package demo1;
/*
时间 ：  2019/1/1319:13

作用 ：
3.题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
基本思路 ：1.跟上面数差不多，只不过既然既然要分解这个整数，就需你输入一个
2.质因数 百度了一下 就是能被自己整除的数。从2开始
3而且满足这些数字想乘能得出我这个整数
*/

import java.util.Scanner;
public class cs15 {
    public static void main(String[] args){
//        第一步接收一个数
        Scanner sc=new Scanner(System.in);
   while (true){
        System.out.println("请输入一个整整数");
        int zhengshu = sc.nextInt();
//        既然接收了这个数，我应该先遍历他
//        初始化
        int a=0;
        int b=0;
//        找一下这个数
        System.out.print(zhengshu+"=");
        for (a=1;a<=zhengshu;a++){
        if (zhengshu%a==0){
            System.out.print(a+"*");
//            现在我把所有能除的数都输出出来了
            //可是我如何实现他们之间的想乘呢
            //他们想乘得出的就是我这个数值每次相乘，也就是说我找到第一个，乘以第二个，第三个也就等于我这个数值每次除以他，name反过来就行了
//            每次输出一个，我/一下他，好了文字上面表达的，我都用软件写清楚了，没有漏的了，我输出看看
            zhengshu=zhengshu/a;

        }

        }
    }
}}
