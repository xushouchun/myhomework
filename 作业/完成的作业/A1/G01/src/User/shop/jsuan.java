package User.shop;
/*
时间 ：  2019/1/2020:42

作用 ：

基本思路 ：
*/


import User.shop.shop;

public class jsuan {
    public static void jiesuan(shop[] chanp) {
        int count = 0;
        for (int a = 0; a < chanp.length; a++) {
            if (chanp[a] != null) {
//            循环购买的产品，拿出他们的价格和数量
                count = count + chanp[a].getCount() * chanp[a].getPrice();
                System.out.println("您商品" + chanp[a].getName() + "共计" + chanp[a].getCount() + "个");
            }
        }
        System.out.println("您的订单合计消费为" + count + "元。");
        for (int a = 0; a < chanp.length; a++){
            if (chanp[a] != null) {
                chanp[a]=null;

            }

        }

    }


}



