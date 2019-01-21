package demo1.User;


//思路：在这里我要让客户实现一个注册的功能的方法


public class zhuc {

    public static void zhuc(User[]b,String x,String s) {
//        客户要登录首先需要输入账号密码
//        输入注册账号和密码后，肯定要比对一下这个账号是否已经存在了
//        所以必须要有一个存放客户的数组才可以，那我们先创一个好了，这个存放客户数组的数组肯定是用户的对象，那么必然也是用户那个类型的

//        首先我们要判断的是不是空的才能搜索，如果是空的话无法比对。所以我们先遍历再判断
        User name = new User();
        name.setName(x);
        name.setPassword(s);

        for (int a = 0; a < b.length; a++) {
            if (b[a] != null) {
//                如果这个数组里面的不是空的账号，肯定是有账号的，那么就可以比对了
//                现在拿什么比对呢，就是客户注册的账号和密码，所以必须我要有一个user的对象，我现在创一个先
                if (name.getName().equals(b[a].getName())) {
                    //如果我这个接收的name 是和数组b【] 有值重叠的账号，那么就是false所以
                    System.out.println("您的账号已经存在，请重新输入账号");
                }


            }
        }
        for (int a = 0; a < b.length; a++) {
            if (a == b.length - 1 && b[b.length - 1] != null) {
                //如果循环的行数到了b数组的行数减去一 也就是最后一行。下标 少一个1 不是空的话到了阀值
                //也就是三种情况，账号是否不同，是否到达阀值，是否为空。
                System.out.println("当前用户注册过多，请稍后再重试");


            }
            if (b[a] == null) {
                b[a] = name;

                System.out.println("恭喜你注册成功");
                break;
            }


        }


    }


}
