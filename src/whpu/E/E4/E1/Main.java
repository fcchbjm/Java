package whpu.E.E4.E1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int listOfInt[] = new int[10];
        System.out.print("请输入10个整型元素:");
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < listOfInt.length; i++) {
            listOfInt[i] = scan.nextInt();
        }
        Arrays.sort(listOfInt);
        System.out.print("请输入要查找的key值:");
        int key = scan.nextInt();
        int ret = BinarySearch.binarySearch(key, listOfInt);
        if(ret < 0) {
            System.out.println("数组中未找到和key值相等的元素");
        }
        else {
            System.out.println(ret);
        }
    }
}
