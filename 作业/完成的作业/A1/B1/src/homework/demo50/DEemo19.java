package homework.demo50;
/*
时间 ：  2019/1/1720:30

作用 ：
题目：打印出如下图案（菱形）
     *
    ***
   ******
  ********
  ******
   ***
   *
程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for循环，第一层控制行，第二层控制列。
基本思路 ：
*/


public class DEemo19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j < 9; j++){
                if (i==2&j==5){
                    System.out.println("*");

                }
                if (i==1&j==5){
                    System.out.println("*");

                }
                if (i==1&j==5){
                    System.out.println("*");

                }


            }


        }

    }
}
