package User.shop;
/*
时间 ：  2019/1/1913:05

作用 ：

基本思路 ：
*/


import Hero.Hero;
import User.user.User;

import java.util.Scanner;
import java.util.jar.JarEntry;

public class Shopcar {

    public static void geitShopCar(Scanner sc, Hero[] yingx, shop[] cp) {



        int xz = sc.nextInt();
        System.out.println("请输入购买数量");
        int xz1 = sc.nextInt();
//        选择什么，对应标签即可。所以循环数值
//        创建一个产品
        shop chanp = new shop();


//        通过循环数组，把客户需要的产品重写打包成产品
        for (int i = 0; i < yingx.length; i++) {
//            如果有对应的标签，那么拿出这个产品的所有信息
            if (yingx[i].getBiaoq() == xz) {
                chanp.setName(yingx[i].getName());
                chanp.setAttribute(yingx[i].getShux());
                chanp.setPrice(yingx[i].getPrice());
                chanp.setCount(xz1);
                break;


            }

//   通过循环把产品放在对应的cp数组里面
        }
        for (int j = 0; j < cp.length; j++) {

            if (cp[j] == null) {
                cp[j] = chanp;
                break;
//                判断一下，如果购物车满了的情况
            }else if(cp.length-1==j&&cp[cp.length-1]!=null){
                System.out.println("您的购物车已满。");
            }

        }        System.out.println("您购买的英雄名称为：" + chanp.getName() + "----价格为：" + chanp.getPrice() + "----数量为： " + chanp.getCount() + "   的绝版英雄已经为您放置在购物车内。");


    }

}





