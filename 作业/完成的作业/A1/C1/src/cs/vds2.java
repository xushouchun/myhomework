package cs;

import java.util.Scanner;

public class vds2 {
    public static void main(String[] args) {
    /*需要初始化的东西
            1存储数据的数组/
    */
        String[][] account = new String[3][2];
//    初始化一个键盘录入
        Scanner sc = new Scanner(System.in);
        //初始化货架
        vds1[] pro = new vds1[5];
        //放商品
        for (int a = 0; a < pro.length; a++) {
            int id =sc.nextInt();
            String pame = sc.next();
            int prisce = sc.nextInt();
            String xq = sc.next();
            vds1 i = vds1.getnew(id,pame,prisce,xq);
            //把商品赋值
            pro [a] = i;

        }
//    程序主入口
        while (true) {
            vbs3.welcome();
            //选择功能
            int xz = sc.nextInt();
//            登陆流程
            if (xz == 1) {
            }
            //注册过程
            if (xz == 2) {
                //接受一个账号密码
                System.out.println("请输入账号");
                String name = sc.next();
                System.out.println("请输入密码");
                String password = sc.next();


            }
            if (xz == 3) {


            }


        }


    }

}
