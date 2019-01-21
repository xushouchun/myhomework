package demo1.cepackage;
/*
时间 ：  2019/1/129:36

作用 ：

基本思路 ：
*/


import demo1.User.User;
import demo1.User.zhuc;
import java.util.Scanner;
public class ceszhuc {
    public static void main(String[] args){
        User []shuju=new User[5];

        //在这里客户输入账号密码
        int f=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号");

        String zhangs=sc.next();
        System.out.println("请输入密码");
        String lis=sc.next();
        //这里是普通方法调用这个类
        zhuc b= new zhuc();
        //调用这个类里面的方法、、
        b.zhuc(shuju,zhangs,lis);



    }


}
