package Hero;
/*
时间 ：  2019/1/1820:52

作用 ：

基本思路 ：先定义英雄的类别，并且为他们提供公共赋值方法
*/


public class Hero {
    //    定义一个英雄的成员变量属性
    private String name;
    private String shux;
    private int price;
    private int biaoq;



    public void setName(String name) {
        this.name = name;
    }


    public void setShux(String shux) {
        this.shux = shux;

    }

    public void setPrice(int price) {
        this.price = price;


    }

    public void setBiaoq(int biaoq) {
        this.biaoq = biaoq;

    }

    public String getName() {
        return name;
    }


    public String getShux() {
        return shux;
    }

    public int getPrice() {
        return price;
    }

    public int getBiaoq() {
        return biaoq;
    }

}
