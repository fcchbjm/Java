package whpu.E.E1.E1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        for (int i = 1; i <= lines; i++) {//表示行数
            for (int j = lines; j >= i; j--)//输出空格
                System.out.print(" ");
            for (int j = 0; j < i-1; j++)//输出左边的三角部分
                System.out.print(i-j );
            for (int j = i-1; j >= 0; j--)//输出右边的三角部分
                System.out.print(i-j);
            System.out.println ( );//输出换行
        }

    }
}
