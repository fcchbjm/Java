package whpu.E.E4.E1;

public class BinarySearch {
    public static int binarySearch(int key, int[] list, int low, int up) {
        if(low > up) {
            return -1;
        }else {
            int mid = (low + up) / 2;
            if(list[mid] < key) {
                binarySearch(key, list, mid + 1, up);
            } else if (list[mid] > key) {
                binarySearch(key, list, low, up - 1);
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int binarySearch(int key, int[] list) {
        return binarySearch(key, list, 0, list.length - 1);
    }
}
