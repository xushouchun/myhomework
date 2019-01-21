package homework.demo50;
/*
时间 ：  2019/1/1716:53

作用 ：题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
程序分析：在10万以内判断，先将该数加上100后再开方，再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。

基本思路 ：
*/


import static java.lang.StrictMath.sqrt;

public class DEMO13 {
    public static void main(String[] args) {
//这里我要用到一个sqrt

        for (int a = 1; a <= 100000; a++) {
            double i = sqrt(a + 100);
            double j = sqrt(a+100+168);
            if (i == (int)i && j == (int)j){
                System.out.println(a);
                //(a - (int)a == 0 && b - (int)b == 0)




        }
    }

}
}