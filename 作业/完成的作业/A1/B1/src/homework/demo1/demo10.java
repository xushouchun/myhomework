package homework.demo1;

/*10、搬砖问题：36块砖，36人搬，男人搬4块，女人搬3块，两个小孩抬1块。
        要求一次搬完，问需要男人、女人、小孩各几人？*/
//思路：4x+3y+z=36
//x+y++2z=36
public class demo10 {

    public static void main(String[] args) {
//设 男人为4x=1 3y=1为女人 小孩为2y=1
        int i, j, z;

        for (z = 2; z <= 36; z += 2)  {
            for (j = 1; j <= 12; j++) {
                for (i = 1; i <= 9; i++) {
                    if ((4 * i + 3 * j + z / 2) == 36 && i + j + z == 36) {
                        System.out.println("男人：" + i + "\n女人：" + j + "\n小孩：" + z);

                    }
                }
            }
        }
    }
}

