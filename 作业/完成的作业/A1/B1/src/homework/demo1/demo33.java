package homework.demo1;

//问题：3、要求用户输入一个年份和一个月份，判断（要求使用嵌套的if…else和switch分别判断一次）该年该月有多少天。

import java.util.Scanner;

public class demo33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份");
        int a = sc.nextInt();
        System.out.println("请输入一个月份");
        int b = sc.nextInt();}}
//        if (a % 4 == 0) {

//            switch (b) {
//                case 1:
//                    System.out.println("您输入的是闰年月份为31天");
//                    break;
//                case 3:
//                    System.out.println("您输入的是闰年月份为31天");
//                    break;
//                case 5:
//                    System.out.println("您输入的是闰年月份为31天");
//                    break;
//                case 7:
//                    System.out.println("您输入的是闰年月份为31天");
//                    break;
//                case 8:
//                    System.out.println("您输入的是闰年月份为31天");
//                    break;
//                case 10:
//                    System.out.println("您输入的是闰年月份为31天");
//                    break;
//                case 12:
//                    System.out.println("您输入的是闰年月份为31天");
//                    break;
//                case 2:
//                    System.out.println("29天");
//                    break;
//
//                default:
//                    System.out.println("月份为30天");
//                    break;

//            } else (a % 4 != 0) {switch (b) {
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    System.out.println("月份为31天");
//                    break;
//                case 2:
//                    System.out.println("28天");
//                    break;
//
//                default:
//                    System.out.println("月份为30天");
//                    break;
//            System.out.println("您输入的是平年");}
////        }
//
//
//            }
//
//        }}}

