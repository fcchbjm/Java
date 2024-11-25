package whpu.T.Test;

public class Test2 {
    public static void main(String args[])
    {
        int result = xMethod(5);
        System.out.println("Result is " + result);
    }
    public static int xMethod(int n)
    {
        if (n == 1)
            return 1;
        else
            return n + xMethod(n - 1);
    }
}
