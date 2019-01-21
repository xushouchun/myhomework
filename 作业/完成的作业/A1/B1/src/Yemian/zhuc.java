package Yemian;
import java.util.Scanner;
public class zhuc {

    public static void main(String[] ags) {

        Scanner sc = new Scanner(System.in);
System.out.println();
        //接收注册信息
        String uname = sc.next();
        String upassword = sc.next();

        //怎么把注册好的账户信息存放起来呢？
        //我想到把这些信息放到数组里
        String[][] account = new String[10][2];

        //通过循环遍历，拿到数组中的每一个用户的账号和密码，进行判断
        for (int m = 0; m < account.length; m++) {
            //拿出数组中的账户，进行比较
            if (uname.equals(account[m][0])) {
                System.out.println("注册账号已存在！");

            }
        }

        //在这里声明一个变量，来判断网站的注册人数是否达到阀值



        //在没有重复账户的情况下，注册成功
        for (int m = 0; m < account.length; m++) {
            if (account[m][0] == null) {
                account[m][0] = uname;
                account[m][1] = upassword;
                System.out.println("账户注册成功！");

                break;

            } else if (m == account.length - 1 && account[m][0] != null) {
                System.out.println("注册帐户已经超过网站负载量，无法注册新账户！");
                return;
            }
        }

        //达到阀值的时候，网站就不能再注册新用户了


        a(uname, upassword, account);

    }


    //把整个注册过程抽取成一个注册方法
    public static boolean a(String uname, String upassword, String[][] account) {
        //通过循环遍历，拿到数组中的每一个用户的账号和密码，进行判断
        for (int m = 0; m < account.length; m++) {
            //拿出数组中的账户，进行比较
            if (uname.equals(account[m][0])) {
                System.out.println("注册账号已存在！");
            }
        }

        //在这里声明一个变量，来判断网站的注册人数是否达到阀值


        //声明一个变量，用来确定用户是否注册成功
        boolean uflag = false;

        //在没有重复账户的情况下，注册成功
        for (int m = 0; m < account.length; m++) {
            if (account[m][0] == null) {
                account[m][0] = uname;
                account[m][1] = upassword;
                System.out.println("账户注册成功！");
                uflag = true;
                break;

            } else if (m == account.length - 1 && account[m][0] != null) {
                System.out.println("注册帐户已经超过网站负载量，无法注册新账户！");
            }
        }

        //达到阀值的时候，网站就不能再注册新用户了

        return uflag;
    }
}