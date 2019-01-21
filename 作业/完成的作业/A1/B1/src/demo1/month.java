package demo1;
import java.util.Scanner;
public class month{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请属于一个月份数字");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("这是春天");
                break;
            case 2:
                System.out.println("这是春天");
                break;
            case 3:
                System.out.println("这是春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("这是夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("这是秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("这是冬天");
                break;
            default:
                    System.out.println("您输入的与现实不符合");

        }
    }

}
