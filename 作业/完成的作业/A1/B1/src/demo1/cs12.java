package demo1;
/*
时间 ：  2019/1/1318:08

作用 ：只能被1和本身整除的数，除此以外没有别的因子。
200以内质数

基本思路 ：
*/


public class cs12 {
    public static void main(String[] args) {
//        先便利总数
        //定义一个总数用来接收所有的循环出现的数
        int count = 0;
        int num = 0;
        for (int i = 101; i < 200; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    count++;
                } else if (i % j == 0) {
                    break;
                }
            }
            if (count == i - 2) {
                System.out.print(i + ",");
                num++;
            }
            count = 0;
        }
        System.out.println();
        System.out.println("素数的个数为：" + num);


    }


}


