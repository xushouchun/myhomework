package homework.demo50;
/*
时间 ：  2019/1/1719:53

作用 ：题目：输出9*9口诀。
程序分析：分行与列考虑，共9行9列，i控制行，j控制列。

基本思路 ：
*/


public class Demo16 {
    public static void main(    String[] args){
        for(int i =1;i<=9;i++){
            for (int j =1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");

            }System.out.println();


        }


    }



}
