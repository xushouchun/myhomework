package demo1.User;


//思路：这个里面存放一些注册的用户方法


public class User {
    //    这里属于成员变量
    private String name;
    private String password;

    //存入的方法
//    这里属于成员方法
    public void setName(String n) {//传递的实际姓名
        this.name = n;
    }

    //拿出的方法
    public String getName() {
        return name;


    }

    public void setPassword(String n) {
        name = n;
    }

    public String getPassword() {
        return password;
//现在用户的方法创建好了
    }

}
