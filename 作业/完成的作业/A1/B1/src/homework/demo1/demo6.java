package homework.demo1;


//6、使用while循环求式子2+22+222+2222+22222的和。p=p*10+2;
//解析 为a + a+a*10+a+a*100
public class demo6 {
    public static void main(String[] args) {
//        创建一个变量 ，算出第一个
        int b = 0;
        //创一个和来接收
        int sum = 0;
        for (int a = 1; a < 6; a++) {
            b = b * 10 + 2;
            sum = sum + b;
        }

        System.out.println(sum);


    }
}

