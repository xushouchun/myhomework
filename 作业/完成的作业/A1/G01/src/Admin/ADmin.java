package Admin;
/*
时间 ：  2019/1/1822:10

作用 ：

基本思路 ：
*/


import Hero.Hero;

import java.util.Scanner;

public class ADmin {

    public void Admin(Hero[] m, Scanner sc) {
        System.out.println("老板您好。今天心情好吗、要开心哦，愿你好哦");

        aa:
        while (true) {
            int count = 0;
            for (int i = 0; i < m.length; i++) {
//            循环放置商品
//            加个控制控制这一行作为第一次出现显示
                if (count == 0) {
                    System.out.println("是否进行上架选择 1.进行上架 2,.注销");
                }
                if (count == 1) {
                    System.out.println("已为您放置完毕，是否继续放置？ 1.继续 2.退出放置查看商品 3.结束系统");
                }
                count = 1;

//      接收选择}
                int xz3 = sc.nextInt();
//            进行判断是否上架或者注销
                if (xz3 == 1) {
//                判断货架是否为空
                    if (m[i] == null) {
//                    for (int j = 0; j < m.length; j++) {
//                    System.out.println("已为您放置完毕，是否继续放置？ 1.继续 2.退出放置");
//                    int xz = sc.nextInt();
//                    if (xz == 1)

                        System.out.println("老板货架一共为" + m.length + "个空置空间您现在放置的是第" + (i + 1) + "个空间");
                        Hero yingxiong = new Hero();
                        System.out.println("请输入要上架的英雄名称");
                        String mingcheng = sc.next();
                        yingxiong.setName(mingcheng);
                        System.out.println("请输入要上架的英雄属性");
                        String shux = sc.next();
                        yingxiong.setShux(shux);
                        System.out.println("请输入要上架的英雄价格");
                        int jiage = sc.nextInt();
                        yingxiong.setPrice(jiage);
                        yingxiong.setBiaoq(i+1);

                        m[i] = yingxiong;

//                判断货架是否已满
                    } else if (i == m.length - 1 && m[m.length - 1] != null) {
                        System.out.println("老板货架已经堆满了。辛苦了,正在为您退出上架系统");
                        break aa;


                    }

//          判断选择是否为注销
                } else if (xz3 == 2) {
                    break aa;
                } else if (xz3 == 3) {
                    return;
                } else {
                    System.out.println("老板您的指令有误，正在为您重启系统");
                    break ;

                }
            }
        }
    }
}

