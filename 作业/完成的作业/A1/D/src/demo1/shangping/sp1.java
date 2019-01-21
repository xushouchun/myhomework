package demo1.shangping;
/*
时间 ：  2019/1/1210:20

作用 ：

基本思路 ：
*/


public class sp1 {
    //    写一下这个类的成员变量属性
   private String name;
    private int jiage;
    private String jieshao;

    //为了简化这些过程，我应该再写一些这个属性赋值的成员方法
    public sp1 cjsp(String name, int jiage, String jieshao) {
        sp1 a = new sp1();
        a.name = "苹果";
        a.jiage = 5;
        a.jieshao = "这个苹果好啊";
//        Systemm.out.println("商品:"+name+"价格"+jiage+"介绍"+jieshao);
        return a;


    }


}




