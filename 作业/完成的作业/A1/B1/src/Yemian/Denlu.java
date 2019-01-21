//package Yemian;
//
//import java.util.Scanner;
//
//public class Denlu {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//
//        String wenti[] = new String[5];
//        wenti[0] = "人吗";
//        String daan[] = new String[5];
//        daan[0] = "废话";
//
//        while (a < 3) {
//
//            System.out.println("请输入登陆账号");
//            String name = sc.next();
//            System.out.println("请输入登陆密码");
//            int password = sc.nextInt();
////        对应一下账号密码
//            String uname = "xushouchun";
//            int upassword = 123456;
//
//
//            if (name.equals(uname) & password == upassword) {
//                System.out.println("欢迎登陆本系统。本系统有你更完美");
//                return;
//
//
//            } else {
//                System.out.println("您的账号密码有误，请重新输入");
//
//                a++;
//            }
//
//
//            if (a == 3) {
//
//                System.out.println("由于输入次数过多，您的账号已被锁定");
//                System.out.println("请回答问题进行解锁输入“1”进行回答。输入2退出");
//                int xuanz = sc.nextInt();
//                if (xuanz == 1) {
//                    int b = 3;
//                    int c = b - 1;
//                    while (b <= 3 & b != 0) {
//
//                        System.out.println(wenti[0]);
//                        String udaan = sc.next();
//                        if (udaan.equals(daan[0])) {
//                            System.out.println("恭喜你回答正确");
//                            a = 2;
//                            break;
//
//
//                        } else {
//                            System.out.println("您的回答有误您还有" + c + "次机会");
//
//                            b--;
//                        }
//                        if (b == 0) {
//                            System.out.println("您的次数已经用尽，请重启系统再试");
//                            return;
//
//                        }
//
//
//                    }
//                }
//            }
//
//        }
//    }
//
//    public static String denglu() {
//        Scanner sc = new Scanner(System.in);
//        int a = 0;
//        String wenti[] = new String[5];
//        wenti[0] = "人吗";
//        String daan[] = new String[5];
//        daan[0] = "废话";
//
//        while (a < 3) {
//
//            System.out.println("请输入登陆账号");
//            String name = sc.next();
//            System.out.println("请输入登陆密码");
//            int password = sc.nextInt();
////        对应一下账号密码
//            String uname = "xushouchun";
//            int upassword = 123456;
//
//
//            if (name.equals(uname) & password == upassword) {
//                System.out.println("欢迎登陆本系统。本系统有你更完美");
//                break;
//
//
//            } else {
//                System.out.println("您的账号密码有误，请重新输入");
//
//                a++;
//            }
//
//
//            if (a == 3) {
//
//                System.out.println("由于输入次数过多，您的账号已被锁定");
//                System.out.println("请回答问题进行解锁输入“1”进行回答。输入2退出");
//                int xuanz = sc.nextInt();
//                if (xuanz == 1) {
//                    int b = 3;
//                    int c = b - 1;
//                    while (b <= 3 & b != 0) {
//
//                        System.out.println(wenti[0]);
//                        String udaan = sc.next();
//                        if (udaan.equals(daan[0])) {
//                            System.out.println("恭喜你回答正确");
//                            a = 2;
//                            break;
//
//
//                        } else {
//                            System.out.println("您的回答有误您还有" + c + "次机会");
//
//                            b--;
//                        }
//                        if (b == 0) {
//                            System.out.println("您的次数已经用尽，请重启系统再试");
//                            return "成功";
//
//                        }
//
//
//                    }
//                }
//            }
//        }
//    }
//}
