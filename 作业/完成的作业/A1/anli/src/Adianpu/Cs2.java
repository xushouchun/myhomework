package Adianpu;
/*
时间 ：  2019/1/1710:30

作用 ：

基本思路 ：
*/


import java.util.Scanner;

public class Cs2 {
    public static void main(String[] args) {
//        初始化区域
        int couna = 0;
        int counNum = 0;
        int counA = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String u = sc.next();

        for (int i = 0; i < u.length(); i++) {
            if ((byte) u.charAt(i) > 47 && (byte) u.charAt(i) < 58) {
                ///数字的Excel列号
                counNum++;
            } else if ((byte) u.charAt(i) > 64 && (byte) u.charAt(i) < 91) {
                //小写字母的Excel列号
                counA++;
            } else if ((byte) u.charAt(i) > 96 && (byte) u.charAt(i) < 123) {//大写字母的Excel列号
                couna++;
            }
        }
        System.out.println("数字有" + counNum + "个，大写字母有" + counA + "个，小写字母有" + couna + "个");


    }


}



