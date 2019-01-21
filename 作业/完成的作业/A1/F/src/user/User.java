package user;
/*
时间 ：  2019/1/1213:32

作用 ：这里作为用户的基础模板

基本思路 ：
*/


public class User {

    private String name;
    private String password;

    //写一个隐藏性存入的方法
    public void setName(String name) {
        this.name = name;


    }
    public String getName(){
        return name;

    }
    public  void  setPassword(String password){
       this.password=password;


    }
    public String getPassword(){
        return password;

    }


}
