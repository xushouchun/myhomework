package cs;

public class vds1 {
//    商品属性
int id;
String pname;
int pricse;
String xq;

//创建对象的方法
    public static vds1 getnew(int id ,String panme,int pricse,String xq){
        vds1 p1 = new vds1();
        p1.id=id;
        p1.pname=panme;
        p1.pricse= pricse;
        p1.xq =xq;

        return p1;



    }


}
