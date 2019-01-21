package homework.demo50;
/*
时间 ：  2019/1/1714:16

作用 ：题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
程序分析：利用while语句,条件为输入的字符不为'\n'.

基本思路 ：
*/

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println("请输入数值");
        String shuzhi = sc.next();
        for (int a = 0; a < shuzhi.length(); a++) {
            if (48 < (byte) shuzhi.charAt(a) & (byte) shuzhi.charAt(a) < 57) {

                b++;
            }
            if (65 < (byte) shuzhi.charAt(a) & (byte) shuzhi.charAt(a) <90 & 97 <(byte) shuzhi.charAt(a) & (byte) shuzhi.charAt(a) <= 122) {
                c++;
            }
            if ((byte) shuzhi.charAt(a) == 32) {

                d++;
            }

        }System.out.println("字母有"+c+"数字有"+b+"空格有"+d);



    }

}
