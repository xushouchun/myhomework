package demo1;
/*
时间 ：  2019/1/1319:39

作用 ：1.请用程序模拟食堂打饭的整个过程
食堂打饭
插入一下，我应该定义一个系统，就是说，一个用户的对象。然后到食堂了，他会说，欢迎来食堂，请排队，请输入你的名字，然后我把名字
放到数组里面。并且给他一个序号，这个序号应该是对象的名字，1号2号  1取号，2打饭，3选择商品
然后打饭，饭就是四种，
1排队
2.一个人打完第二个 循环
3，先定义自己是第几个
4.打饭饭卡 扣钱  饭卡有多少钱减去饭钱
5选择菜品
6拿过去吃饭结束

基本思路 ：
*/

import java.util.Scanner;
public class cs16 {
    public static void main(String[] args){
//        既然要排队的话，那么我先要知道我是第几个。所以先输入一下我是第几号
        Scanner sc =new  Scanner(System.in);
        System.out.print("请告诉我你过来是排了第几个了，请输入一个正整数");
        int paihao = sc.nextInt();
        //既然拿到号了我肯定就要排队了，怎么实现循环到我呢



    }
}
