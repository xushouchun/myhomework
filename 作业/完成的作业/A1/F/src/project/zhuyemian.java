package project;
/*
时间 ：  2019/1/1213:22

作用 ：

基本思路 ：
*/

import shangp.sp;
import user.User;
import user.dengl;
import user.zhuc;

import java.util.Scanner;

public class zhuyemian {
    public static void main(String[] args) {
//        初始化
        Scanner sc = new Scanner(System.in);
        User[] users = new User[10];
        sp[] sping = new sp[5];

        while (true) {
            pb.pb.pbwelcome();

//        这里有个选择登录注册的接收
            int xzone = sc.nextInt();

            if (xzone == 1) {
                System.out.println("请输入注册账号(注册账号不得少于2位)");
                String name = sc.next();
                System.out.println("请输入注册密码(注册密码不得少于2位)");
                String password = sc.next();


                zhuc zc = new zhuc();
                zc.zhuc(users, name, password);


            }
            if (xzone == 2) {
                System.out.println("请输入登录账号");
                String name = sc.next();
                System.out.println("请输入登录密码");
                String password = sc.next();

                dengl dl = new dengl();
                dl.denglu(users, name, password);

               aa: for (int a = 0; a < sping.length; a++) {
                    System.out.println("请输入商品的名字");
                    String spname = sc.next();
                    System.out.println("请输入商品的价格");
                    int spjiage = sc.nextInt();
                    System.out.println("请输入商品的详情");
                    String spxq = sc.next();
                    sp s = sp.cjianshangp(spname, spjiage, spxq, a);
                    sping[a] = s;
                    System.out.println("是否继续添加1是2不是");
                    int xz2 = sc.nextInt();
                    if (xz2 == 2) {

                       break aa;
                    }
                    for (int b = 0; b< sping.length; b++) {
                        if (sping[b] != null) {
                            System.out.print(sping[b].name);
                            System.out.print(sping[b].biaoqian);
                            System.out.print(sping[b].jiage);
                            System.out.print(sping[b].jieshao);


                        }


                    }


                }
            }

        }
    }
}
