import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main6 {
    /**
     * 题目描述
     *                                1
     *
     *                             1  1  1
     *
     *                          1  2  3  2  1
     *
     *                     1   3   6  7  6  3  1
     *
     *                  1  4  10  16 19 16  10  4  1
     *
     *               1  5  15 20  45 51 45  30  15  5  1
     *
     *            1  6 21  40 80
     * 以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数，
     * 左上角数到右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
     *
     * 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。
     *
     *
     * 输入n(n <= 1000000000)
     * 本题有多组输入数据，输入到文件末尾，请使用while(cin>>)等方式读入
     * 输入描述:
     * 输入一个int整数
     *
     * 输出描述:
     * 输出返回的int值
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int input = sc.nextInt();
            System.out.println(getNumber(input));
        }

    }

    private static int getNumber(int input) {
        if(input==1||input == 2){
            return -1;
        }else {
            if(input%2==1){
                return 2;
            }else if (input%4==0){
                return 3;
            }else {
                return 4;
            }
        }
    }
}
