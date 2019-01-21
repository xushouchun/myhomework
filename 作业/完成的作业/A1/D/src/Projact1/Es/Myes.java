package Projact1.Es;

//
//思路：店铺应该拥有的一些基本功能，
//注册
//登陆
//商品展示
//选购
//购物车
//结算

import demo1.PB1.Pb1;
import demo1.User.dengl;
import demo1.User.User;
import demo1.User.zhuc;
import demo1.User.dengl;

import java.util.Scanner;

public class Myes {
    public static void main(String[] args) {
//        声明一些初始化的当西
//        键盘录入
        Scanner sc = new Scanner(System.in);
//        既然来到我的这个店铺，应该有一些欢迎语句
        User[] yonghu = new User[5];

//欢迎语
//-------------------------------------------------------------------------
        while (true) {

            Pb1.eshuany();
//                  ------------------------------------------------
//           客户需要选择
            int xz1 = sc.nextInt();
//            在这里系统应该判断一下，然后进入执行
            if (xz1 == 1) {
//                客户注册之后在这里登录。不能循环，应该直接跳到san
                System.out.println("请输入账号");
                String name = sc.next();
                System.out.println("请输入密码");
                String password = sc.next();
//            调用注册的类

                
                dengl s = new dengl();
//            调用注册方法
                s.denglu(yonghu, name, password,xz1);



            }
//            这个肯定是新用户所以一定会先注册，但是我没有注册的用户对象。所以我要创建一个
            if (xz1 == 2) {
                System.out.println("请输入账号");
                String name = sc.next();
                System.out.println("请输入密码");
                String password = sc.next();

                zhuc.zhuc(yonghu, name, password);


            }
            if (xz1==3){

                System.out.println("欢迎来到小铺请选择商品");


            }

        }
    }

}
