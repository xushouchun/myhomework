package homework.demo50;
/*
时间 ：  2019/1/1113:44

作用 ：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立
方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。

基本思路 ：
*/


public class demo3 {
    public static void main(String[] args) {
        for (int a = 100; a <= 999; a++) {
            int ge,shi,bai;
            ge=a%10;
            shi=a%100/10;
            bai=a%1000/100;

            if (ge*ge*ge+bai*bai*bai+shi*shi*shi==a){

                System.out.println(a);
            }


        }
    }


}