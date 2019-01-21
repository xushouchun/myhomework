package user;
/*
时间 ：  2019/1/1213:49

作用 ：

基本思路 ：
*/


public class zhuc {

    public void zhuc(User[] b, String name, String password) {

            User AS = new User();
            AS.setName(name);
            AS.setPassword(password);

//      注册需要考虑的因素，存放用户的数组不为空的情况下，有没有重复账号。存放用户的数组没有满。如果都为false 那么久为true 存放用户类型数组即可


            for (int a = 0; a < b.length; a++) {
                if (b[a] != null) {
                    if (AS.getName().equals(b[a].getName())) {
                        System.out.println("您的账户已经存在，请换个账号再重试");
                       break;
                    }
                    if (a == b.length - 1 && b[b.length - 1] != null) {
                        System.out.println("系统繁忙请稍后再试");
                        return;
                    }

                } else if (b[a] == null) {

                    b[a] = AS;
                    System.out.println("恭喜您账号名为" + name + "注册成功,请登录");
                    break;

                }


            }

        }
    }


