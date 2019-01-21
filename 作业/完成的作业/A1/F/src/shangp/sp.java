package shangp;
/*
时间 ：  2019/1/1512:34

作用 ：

基本思路 ：
*/


public class sp {
   public int biaoqian;
    public String name;
    public int jiage;
    public String jieshao;

    public static sp cjianshangp(String name, int jiage, String jieshao, int biaoqian) {
        sp n1 = new sp();
        n1.name = name;
        n1.jiage = jiage;
        n1.jieshao = jieshao;
        n1.biaoqian = biaoqian;
        return n1;

    }


}

