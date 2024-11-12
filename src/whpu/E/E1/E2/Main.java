package whpu.E.E1.E2;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 50; i++) {
            int n = 0;
            for (n = 2; n <= Math.sqrt(i); n++) {
                if (i % n == 0)
                    break;
            }
            if (n > Math.sqrt(i)) {
                count++;
                if(count % 10 == 0)
                    System.out.println(i);
                else
                    System.out.printf("%-4d ", i);
            }
        }
    }
}
