package user;
/*
时间 ：  2019/1/1214:37

作用 ：

基本思路 ：
*/


public class dengl {

    public void denglu(User[] i, String name, String password) {

        //            如果输入的String类型的账号密码为数组里面的账号密码 ，那么 登录成功，否者的话就是错误的。


        for (int a = 0; a < i.length; a++)
            if (i[a] != null) {
                if (name.equals(i[a].getName()) && password.equals(i[a].getPassword())) {
                    System.out.println("恭喜您登录成功，欢迎来到小徐商品空间");
                    break;
                } else {
                    System.out.println("您的账号或者密码有误，请查证后再登录");


                }


            }
    }
}
