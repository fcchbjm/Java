package whpu.E.E1.E4;

import java.util.Scanner;

public class Main {
    void move(int num, char x, char y){
        System.out.println("Move disk " + num + " from " + x + " to " + y);
    }
    void Hanoi(int num, char a, char b, char c){
        if(num == 1){
            move(num, a, c);
        }
        else {
            Hanoi(num - 1, a, c, b);
            move(num, a, c);
            Hanoi(num - 1, b, a, c);
        }
    }
    public static void main(String args[]){
        System.out.print("请输入盘子的个数:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Main M = new Main();
        M.Hanoi(n, 'A', 'B', 'C');
    }
}
