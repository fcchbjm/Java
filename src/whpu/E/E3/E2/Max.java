package whpu.E.E3.E2;

public class Max {
    public static <T extends Comparable<T>> T max(T o1, T o2) {
        int ret = o1.compareTo(o2);
        if(ret > 0) {
            return o1;
        }
        else {
            return  o2;
        }
    }
}
