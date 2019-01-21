package User.denglu;
/*
时间 ：  2019/1/188:54

作用 ：

基本思路 ：
*/


import User.user.User;

import java.util.Scanner;

public class Denglu {

    public void dl(User[] yonghu, String name, String password, Scanner sc) {
//        客户需要登录，需要三个参数，账号密码。然后对比数据库中的账号密码。是否一致即可，进行判断
        int count = 0;
        int a = 0;
//       定义一个控制变量
        aa:
        while (true) {
            if (a == 1) {
                System.out.println("请输入登录账号");
                String uname = sc.next();
                System.out.println("请输入登录密码");
                String upassword = sc.next();
            }
            if (a > 1) {
                a = 0;
            } else {
                a++;
            }


//                      在这里判断客户是否重新登录，还是返回注册

            for (int i = 0; i < yonghu.length; i++) {
                if (name.equals(yonghu[i].getName()) && password.equals(yonghu[i].getPassword())) {
                    System.out.println("恭喜您登录成功，欢迎来到老徐英雄馆");
                    break aa;

                } else {

                    System.out.println("您输入的账号密码有误，请重新输入，您有三次机会重试，本次为" + count + "次");
                    count++;
                    break;
                }


            }
            if (count == 2) {

                System.out.println("您还有最后一次机会，请珍惜");
            }


            if (count == 3) {

                System.out.println("............. 你咋不上天呢，这都登录不上呢");


            }

        }

    }


}



