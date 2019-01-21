package demo1.User;
/*
时间 ：  2019/1/1122:07

作用 ：

基本思路 ：
*/


public class dengl {


    public void denglu(User[] yonghu, String name, String password ,int d ) {
//      对方输入一个他的用户 所以肯定是接收一个账号密码



//拿到数据库去比对


        for (int a = 0; a < yonghu.length; a++) {

            if (name.equals(yonghu[a].getName())&&password.equals(yonghu[a].getPassword())) {
                System.out.println("欢迎登陆本系统。本系统有你更完美");
                   d=3;
                break;


            } else {
                System.out.println("您的账号密码有误，请重新输入");
                    break;

            }


//            if (d == 3) {
//
//                System.out.println("由于输入次数过多，您的账号已被锁定");
//                System.out.println("请回答问题进行解锁输入“1”进行回答。输入2退出");
//                int xuanz = sc.nextInt();
//                if (xuanz == 1) {
//                    int b = 3;
//                    int c = b - 1;
//                    while (b <= 3 & b != 0) {
//
//                        System.out.println(wenti[0]);
//                        String udaan = sc.next();
//                        if (udaan.equals(daan[0])) {
//                            System.out.println("恭喜你回答正确");
//                            d = 2;
//                            break;
//
//
//                        } else {
//                            System.out.println("您的回答有误您还有" + c + "次机会");
//
//                            b--;
//                        }
//                        if (b == 0) {
//                            System.out.println("您的次数已经用尽，请重启系统再试");
//                            return;
//
//                        }


        }
    }
}
