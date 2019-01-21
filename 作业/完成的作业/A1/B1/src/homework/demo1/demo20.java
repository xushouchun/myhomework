package homework.demo1;
/*20、某城市出租车计费问题：Ø每日06:00-21:00，起步价6元，当日22:00-次日05:00，起步价7元
。Ø起步价包含2公里，超出部分按照每公里1.5元收费。Ø每次乘车加收1元的燃油附加税。
        输入打车的时间和距离，计算本次打车的费用。*/

import java.util.Scanner;

public class demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入打车的时间");
        int a = sc.nextInt();
        System.out.println("请输入打车的距离(公里)");
        int b = sc.nextInt();
        double mub;
        if (a <= 21 & a >= 6 & b > 2) {
            mub = 6 + 1 + (b - 2) * 1.5;
            System.out.println("您的本次打车费用为：" + mub);

        } else if (a >= 22 & a <= 24) {
            mub = 7 + 1 + (b - 2) * 1.5;
            System.out.println("您的本次打车费用为：" + mub);
        } else if (a > 0 & a <= 5) {
            mub = 7 + 1 + (b - 2) * 1.5;
            System.out.println("您的本次打车费用为：" + mub);


        } else {
            System.out.print("您输入的时间有误");

        }
    }
}
