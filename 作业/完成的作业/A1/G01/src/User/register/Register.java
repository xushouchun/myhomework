package User.register;
/*
时间 ：  2019/1/189:39

作用 ：

基本思路 ：
*/


import User.user.User;

public class Register {

    public void zc(User[] a, String name, String password) {
//        判断条件，如果数组不为o 没有重复的账号，把注册号的用户放到数组里面
//        先创建一个用户 满足放入，不满足打回
        User yonghu = new User();
        yonghu.setName(name);
        yonghu.setPassword(password);


        for (int i = 0; i < a.length; i++) {
//            判断里面是否为空，不为空进行对比
            if (a[i] != null) {
                if (name.equals(a[i].getName())) {
                    System.out.println("您输入的账号已存在，请重新输入");
                    break;


                } else if (i == a.length - 1 && a[a.length - 1] != null) {

                    System.out.println("您好网页正在维护，请稍后再重试");
                    break;
                }

//                判断完成不为空的情况，开始判断为空的

            } else if (a[i] == null) {
                System.out.println("恭喜您注册成功，请使用账号" + name + "进行登录");
                a[i] = yonghu;

                break;

            }


        }

    }
}
