package whpu.T.Test;

class Counter
{
    int num = 0;
    public void add() {
        num++;
    }
}
public class Test3 {
    static void fun(Counter counter, int i) {
        for(int j = 0; j < 5; j++) {
            counter.add();
            i++;
        }
    }
    public static void main(String args[]) {
        Counter counter = new Counter();
        int i = 0;
        fun(counter, i);
        System.out.println("counter.num="+counter.num);
        System.out.println("i="+i);
    }
}
