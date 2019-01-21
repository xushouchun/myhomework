package homework.demo1;

//4、要求用户输入一个学生的分数（1~100），使用switch结构判断该分数属于什么等级（A、B、C、D、F）。


import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        while (true) {


            System.out.println("请输入您的分数");
            int a = sc.nextInt();

            if (a <= 100) {
                switch (a / 10) {
                    case 1:
                        System.out.println("您的成绩为F");
                        break;
                    case 2:
                        System.out.println("您的成绩为F");
                        break;
                    case 3:
                        System.out.println("您的成绩为D");
                        break;
                    case 4:
                        System.out.println("您的成绩为D");
                        break;
                    case 5:
                        System.out.println("您的成绩为C");
                        break;
                    case 6:
                        System.out.println("您的成绩为C");
                        break;
                    case 7:
                        System.out.println("您的成绩B");
                        break;
                    case 8:
                        System.out.println("您的成绩B");
                        break;
                    case 9:
                        System.out.println("您的成绩为A");
                        break;
                    case 10:
                        System.out.println("您的成绩为A");
                        break;
                    case 0:
                        System.out.println("您的成绩为F");
                        break;
                    default:
                        System.out.println("您输入有误");
                }
            } else {
                System.out.println("你输入的分数有误");

            }

        }
    }
}
