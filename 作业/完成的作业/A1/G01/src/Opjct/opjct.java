package Opjct;
/*
时间 ：  2019/1/189:10

作用 ：

基本思路 ：
*/


import Admin.ADmin;
import Hero.Hero;
import Sql.Splone;
import User.denglu.Denglu;
import User.register.Register;
import User.shop.Shopcar;
import User.shop.jsuan;
import User.shop.shop;
import User.user.User;

import java.util.Scanner;

public class opjct {
    public static void main(String[] args) {
        Hero[] yingx = Splone.Herosql();
        User[] yonghu = Splone.Usersql();
        shop[] chanp = Splone.shopsql();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("欢迎来到老徐英雄馆,年轻人来都来了逛一逛把！");
            System.out.println("1，注册");
            System.out.println("2，登录");
            System.out.println("3，进入商城");
            System.out.println("4，管理员模式");
            int xz = sc.nextInt();

            aaa:
            while (true) {

                while (true) {
                    if (xz == 1) {

                        System.out.println("请输入账号");
                        String name = sc.next();
                        System.out.println("请输入密码");
                        String password = sc.next();
                        Register getregister = new Register();
                        getregister.zc(yonghu, name, password);

                        System.out.println("是否进行登录 1.开始登录 2.重新注册");
                        int xz2 = sc.nextInt();
                        if (xz2 == 1) {
                            xz = 2;


                        } else if (xz2 == 2) {


                        } else {
                            System.out.println("您输入有误，请重新输入");

                        }


                    }
                    if (xz == 2) {
//                如果选择为2 进入登录页面
                        System.out.println("请输入登录账号");
                        String uname = sc.next();
                        System.out.println("请输入登录密码");
                        String upassword = sc.next();
                        Denglu getdenglu = new Denglu();
                        getdenglu.dl(yonghu, uname, upassword, sc);
                        xz = 3;

                    }
//                这里是商品页面
                    if (xz == 3) {
                        while (true) {

                            System.out.println("年轻人都是最新绝版英雄，挑一个把");
//                    遍历 展示商品
                            for (int i = 0; i < yingx.length; i++) {
                                if (yingx[i] != null) {
                                    System.out.print("英雄标签：" + yingx[i].getBiaoq() + " ");
                                    System.out.print("英雄名称：" + yingx[i].getName() + " ");
                                    System.out.print("英雄属性：" + yingx[i].getShux() + " ");
                                    System.out.print("英雄价格：" + yingx[i].getPrice() + " ");
                                    System.out.println();
                                } else {
                                    break;
                                }


                            }
//                    定义一个购物选择为商品选择判断
                            System.out.println("1.挑选商品 2.退出");
                            int gouwuxz = sc.nextInt();
                            if (gouwuxz == 1) {
                                yb:
                                while (true) {
                                    while (true) {
                                        System.out.println("请选择您中意的英雄编号");
//                        客户如果选择商品，第一步是放在购物车里面。所以我要创一个购物车
                                        Shopcar.geitShopCar(sc, yingx, chanp);
//                      需要传的参数  Scanner sc, Hero[] yingx, shop[] cp, User u
                                     bb:   while (true) {
                                            System.out.println("是否继续购物 1；  继续购物  2；订单结算  3;查看购物车 4；返回商品主页");
//                     定义一个xz12作为本次选择判断
                                            int xz12 = sc.nextInt();

//                            在这里要定一个控制闸门
                                            if (xz12 == 1) {
                                                break bb;
                                            } else if (xz12 == 2) {
//                                    在这里进行结算
                                                jsuan.jiesuan(chanp);
                                                System.out.println("恭喜您结算成功，是否退出？ 1：退出！     2：任意键返回商品展示");
                                                int xzq = sc.nextInt();
                                                if (xzq == 1) {
                                               return;
                                                } else {
                                                    xz = 3;

                                                }


                                            } else if (xz12 == 3) {
                                                for (int oo = 0; oo < chanp.length; oo++) {
                                                    if (chanp[oo] != null) {
                                                        System.out.println("您订单中的第" + (oo + 1) + "件商品");
                                                        System.out.println("============================================================");
                                                        System.out.print("英雄数量" + chanp[oo].getCount() + " ");
                                                        System.out.print("英雄名称：" + chanp[oo].getName() + " ");
                                                        System.out.print("英雄属性" + chanp[oo].getAttribute() + " ");
                                                        System.out.print("英雄价格" + chanp[oo].getPrice() + " ");
                                                     System.out.println("您的订单已经展示完毕正在为您返回。读取中。。。");
                                                    }
                                                }
//                                    在这里弄个for循环 购物车  循环完成后再判断
                                            } else if (xz12 == 4) {
                                                break yb;
                                            } else {
                                                System.out.println("您输入有误请请重新输入");
                                                break;

                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                    if (xz == 4) {
//                    管理员模式
                        ADmin guanliyuan = new ADmin();
                        guanliyuan.Admin(yingx, sc);
                        xz = 3;

                    }


                }
            }
        }
    }
}

