package demo1;
import java.util.Scanner;
public class ifmonth {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请说出你的年龄");
        int a = sc.nextInt();
        if ( a>0 & a<18 ){
            System.out.println("你是未成年");

        }else if ( a>=18 & a<=30 ){
            System.out.println("你是青少年");

        }else if(a>30 & a<50){
            System.out.println("您是壮年");
        }else{
            System.out.println("你是呆逼吗");
        }




    }



}


