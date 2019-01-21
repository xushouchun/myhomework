package homework.demo50;

/*时间 ：  2019/1/1112:47

作用 ：题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
假如兔子都不死，问每个月的兔子对数为多少？

基本思路 ：假设现在有一对兔子，
      兔子的规律为数列1,1,   2,3,5,8,13,21....
      也就是说 只要把排列弄出来即可*/


import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        long s1 = 1;
        long s2 = 1;
        int count;
        long temp;
        Scanner in = new Scanner(System.in);
        count = in.nextInt();
//        先输入一个月份
        for (int i = 1; i <= count; i++) {
//            在月份里面循环
//            如果是一二月的话，肯定是一个兔子
            if (i == 1) {
                System.out.println("第" + i + "个月的兔子对数：" + s1);

            } else if (i == 2) {
                System.out.println("第" + i + "个月的兔子对数：" + s2);

//               如果是第三个月的话，等于第一个月的兔子加上第二个月的兔子
//                第四个月的兔子，等于第二个月加上第三个月的兔子
//                那么
//                兔子的规律为数列1,1,   2,3,5,8,13,21....

            } else {
                temp = s2;
                s2 = s1 + s2;
                s1 = temp;
                System.out.println("第" + i + "个月的兔子对数：" + s2);
            }
        }
    }
}




