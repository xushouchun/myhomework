package homework.demo50;
/*
时间 ：  2019/1/1114:29

作用 ：题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：



(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。

基本思路 ：
*/

import java.util.Scanner;
public class demo4 {
    public static void main(String[] args)
    {
        int parm=0;
//int i=0;
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.print(n+"=");
        for(int i=2;i<=n;i++)
        {
          for (int j=1;j<i;j++)
            {
                if(n%i==0)
                {
                    System.out.print(i+"*");
                    n=n/i;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.print(n);
    }
}

