package homework.demo50;
/*
时间 ：  2019/1/1715:18

作用 ：题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。


基本思路 ：既然求1000以内的数字，我就必须在1000里面找，当是这个值时候，求出他的公因数，然后计算
每次计算完后我的和必须重置。最后判断是否相等/
*/


public class DEMO9 {
    public static void main(String[] args){
        int num ;
        for (int i =3;i<=1000;i++){
            num =0;
            for (int j=1;j<i;j++) {
              if (i%j==0){
                  num = num+j;
                  System.out.println(num);


            }

            }if (num==i){
                System.out.println(i);
            }

        }



    }
}
