package Adianpu;
/*
时间 ：  2019/1/1216:09

作用 ：

基本思路 ：
*/


import java.util.Scanner;

public class cs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cs1[] p = new cs1[2];
        for (int i = 0; i < p.length; i++) {
            System.out.println("请输入商品名称");
            String name=sc.next();
            System.out.println("请输入商品价格");
            int price=sc.nextInt();
            System.out.println("请输入商品的介绍");
            String intruduse=sc.next();
            cs1 a = cs1.sp(name, price,intruduse);
            p[i]= a;



        }
        for (int i=0;i<p.length;i++){
            System.out.print("  商品名称为  "+p[i].name);
            System.out.print("  商品名称为  "+p[i].price);
            System.out.print("  商品名称为   "+p[i].introdus);
            System.out.println();

        }

    }
}
