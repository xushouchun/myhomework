package homework.demo1;


//思路：小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
//        每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
//首先天数是自增的，钱数是需要在不满足100的情况下循环，钱数每天循环一次 钱数就会加2.5  并且 如果是取余5等于零 就要消费6块钱

public class demo21 {
    public static void main(String[] args) {
        int day = 0;
        double money = 0;
        while (money < 100) {
            if (day % 5 == 0) {
                money = money - 6;

            }
            money = 2.5 + money;
            day++;
        }System.out.println(day);
    }
}
