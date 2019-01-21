package Hero;
/*
时间 ：  2019/1/1822:26

作用 ：

基本思路 ：
*/


public class Heroone {
    public Hero gethero( String name, String shux, int a, int b) {
        Hero p = new Hero();
        p.setName(name);
        p.setShux(shux);
        p.setBiaoq(b);
        p.setPrice(a);

        return p;
    }
}
