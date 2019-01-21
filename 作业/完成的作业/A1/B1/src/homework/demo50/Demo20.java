package homework.demo50;
/*
时间 ：  2019/1/1720:51

作用 ：题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
2 3 5 8 13 21
1 2 3 4 8 13

程序分析：请抓住分子与分母的变化规律。
tem=s1+s2
 s1=s2
 s2=tem


基本思路 ：
*/


public class Demo20 {

        public static void main(String[] args){
            //定义项数
            int j = 20;
            double num = 0;
            for(int i=1;i<=j;i++) {
                num = num + (zi(i)/mu(i));
            }
            System.out.println(num);
        }
        //求的是第i项的分子
        public static double zi(int i) {
            if(i==1) {
                return 2;
            }else {
                return mu(i-1)+zi(i-1);
            }
        }
        //求的是第i项的分母
        public static double mu(int i) {
            if(i==1) {
                return 1;
            }else {
                return zi(i-1);
            }
        }
    }


