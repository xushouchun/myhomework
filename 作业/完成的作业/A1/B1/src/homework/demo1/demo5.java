package homework.demo1;

//5、使用while循环求1~100以内所有奇数的和。
// 弄出一个奇数，后面再加
public class demo5 {
    public static void main(String[] args) {
        int sum = 0;
//        循环判断范围
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 1) {
                sum = sum + a;


            }

        } System.out.println(sum);
    }
}
