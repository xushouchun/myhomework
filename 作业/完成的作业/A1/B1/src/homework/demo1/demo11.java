package homework.demo1;

//12、题目：一个数如果恰好等于它的因子之和，这个数就称为”完数”。例如6=1＋2＋3.编程找出1000以内的所有完数。
public class demo11 {
    public static void main(String[] args) {

//        设外循环找出1000以内的 变量为a
//        再循环满足a这个数里面数。
//        在循环满足a这个数里面数里面，满足一个能被他整出的数
//        让他们相加
//        设置sum 为和相加变量
        //, 每次循环玩之后,不叠加.
        //最后输出所有的完数.
        int sum = 0;
        for (int a = 2; a <= 1000; a++) {
            for (int b = 1; a > b; b++) {
                if (a % b == 0) {
                    sum = sum + b;


                }
                //循环完之后的的和如果等于b的话
            }
            if (sum == a) {
                System.out.println(sum);


            }
            //由于不是叠加运算所欲每次需要初始化
            sum = 0;

        }
    }
}

