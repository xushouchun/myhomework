package Dduixiang;




public class Student {
//    /先确定学生的属性
    String name;
    String sex;
    String age;
    int xuehao;

    public void eat(String name){
        System.out.println(name+"在吃饭");
    }
    public void sleep(String name){

        System.out.println(name+"在睡觉");

    }
    public void game(String name){

        System.out.println(name+"在游戏");

    }


public static void main(String[] args){
 Student wenqiang = new Student();
 wenqiang.age = "18";
 wenqiang.name = "文强";
 wenqiang.sex = "男";
 wenqiang.xuehao = 123456;

 wenqiang.eat(wenqiang.name);
 wenqiang.sleep(wenqiang.name);
wenqiang.game(wenqiang.name);

System.out.println(wenqiang.age);

}





}
