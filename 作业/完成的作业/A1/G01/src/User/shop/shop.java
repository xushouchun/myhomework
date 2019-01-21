package User.shop;
/*
时间 ：  2019/1/1915:27

作用 ：

基本思路 ：
*/


import User.user.User;

public class shop {
    private String name;
    private String attribute;
    private int price;
    private int count;


    public void setName(String name) {
        this.name = name;
    }


    public void setPrice(int price) {
        this.price = price;


    }

    public String getName() {
        return name;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {


        this.count = count;

    }

    public String getAttribute() {
        return attribute;
    }

}
