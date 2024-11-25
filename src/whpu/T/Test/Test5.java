package whpu.T.Test;

public class Test5 {
    public static void main(String args[]) {
        String str = "Hello\nWelcome to Java!";
        String regex = "[\\s\\p{Punct}]+";
        String words[] = str.split(regex);
        for(String word : words) {
            System.out.println(word + " ");
        }
    }
}
