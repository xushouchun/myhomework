package homework.demo1;

/*7、请编程验证一下“角谷猜想”：对任意的自然数，若是奇数，就对它乘以3加1；若是偶
        数就对它除以2；这样得到一个新数，再按上述奇数、偶数的计算规则进行计算，
        一直进行下去，最终将得到1。如对自然数11，按上述规则依次得到34、17、52、26、13、40、
        20、10、5、16、8、4、2、1。要求用户输入一个自然数（正整数），然后编程输出依次变换最终得到1的过程。*/

import java.util.Scanner;

public class demo7 {
    public static void main(String[] agrs) {
        System.out.println("请输入一个自然数");
//        接一个包
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int a = 1; a < 50; a++) {
            if (x % 2 != 0 & x != 1) {
                x = x * 3 + 1;


                System.out.println(x);
            } else if (x % 2 == 0) {
                x = x / 2;
                System.out.println(x);


            } else {
                System.out.println("您输入的为1所以结果为1");
                break;

            }

        }
    }
}
