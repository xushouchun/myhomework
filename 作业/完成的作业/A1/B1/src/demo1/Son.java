package demo1;
/*
时间 ：  2019/1/1410:07

作用 ：

基本思路 ：
*/


class Son extends Father {
    public int num = 20;




    public void show() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);

    }
}

