package cs;

public class vds {
    public static void main(String[]args){
        vds1 p1 = new vds1();
        p1.id=10001;
        p1.pname="苹果";
        p1.pricse=10;
        p1.xq ="这个苹果好";
        System.out.println("商品id"+p1.id);
        System.out.println("商品名称"+p1.pname);
        System.out.println("商品价格"+p1.pricse);
        System.out.println("商品详情"+p1.xq);

       vds1 p2= vds1.getnew(10002,"黄瓜",2,"这个黄瓜好啊");

        System.out.println("商品id"+p2.id);
        System.out.println("商品名称"+p2.pname);
        System.out.println("商品价格"+p2.pricse);
        System.out.println("商品详情"+p2.xq);

    }
}
