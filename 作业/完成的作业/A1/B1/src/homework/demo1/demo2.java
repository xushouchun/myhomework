package homework.demo1;
import java.util.Scanner;
public class demo2 {

    //2、要求用户输入两个整数，判断第一个整数是否是第二个整数的倍数。
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入第一个整数");
    int a = sc.nextInt();
    System.out.println("请输入第二个整数");
    int b = sc.nextInt();
    int c=0;
    if ( a%b==0 ){
        c = a/b;
        System.out.println("您输入的第一个整数是第二个整数的倍数");
        System.out.println("整数倍数为"+c+"倍");

    }else {
        System.out.println("您输入的不是第二个整数的倍数");

    }



    }



}
