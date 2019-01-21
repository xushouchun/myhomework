package demo1;
/*
时间 ：  2019/1/1318:43

作用 ：作用 ：只能被1和本身整除的数，除此以外没有别的因子。
200以内质数


基本思路 ：
*/


public class cs14 {
    public static void main(String[] args) {
//        定义一个计数器
        int count = 0;
//        先循环总的
        for (int i = 101; i <= 200; i++) {
//           再循环这个数值里面的内循环
            for (int m = 2; m <= i; m++) {
//                因为数字除以1肯定等于这个数，所以也就是除了自己能整除 其他都不行

                if (i != m && i % m == 0) {
                    // 当他不等于自身情况下，他处于其他书如果能除掉，肯定就不是题目要的东西，直接跳出来
                    break;
                }
                // 判断,此时该数肯定是素数
                else if (i == m && i % m == 0) {
                    // 反过来，如果能除的话，他是自己并且除与处于内循环的数满足这些条件，就把这个 外循环的数给输入出来。计数一次跳出来
                    System.out.println(i);
                    count++;
                    break;

                }
            }
//            }字面意思得出结果···
        }
        System.out.println("有" + count + "个质数");
    }
}
