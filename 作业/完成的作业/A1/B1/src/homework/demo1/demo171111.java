package homework.demo1;
//17、要求用户输入用户名和密码，只要不是admin和111就提示用户名或密码不正确，请重新输入。正确时结束循环，提示登陆成功

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Scanner;

public class demo171111 {
    public static void main(String[] args) {
        String userName = "admin";
        String passWord = "admin";

        Scanner sc = new Scanner(System.in);
        int mun = 0;
        while (true) {
            if (mun < 3) {

                System.out.println("请输入账号");
                String name = sc.next();
                System.out.println("请输入密码");
                String password = sc.next();
                if (name.equals(userName) & password.equals(passWord)) {

                    System.out.println("恭喜你登录成功");
                    return;
                } else {

                    System.out.println("您的账号或者密码有误，请重新输入");
                    mun++;
                }

            } else {
                System.out.println("您的账号已被锁定");
                return;

            }
        }
    }
}
