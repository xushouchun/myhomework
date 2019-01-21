package homework.demo1;

/*9、使用for循环的嵌套编程输出如下图形：
 *                  *
 ***              ***
 *****          *****
 *******      *******
 *********  ********* */
//p=p+2
public class demo9 {
    public static void main(String[] args) {
//        先确立行

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");

            }

        System.out.println();

        }

    }}




