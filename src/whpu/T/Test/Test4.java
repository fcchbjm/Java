package whpu.T.Test;

class Father {
    public Father() {
        System.out.println("Father's constructer");
    }
}

class Son extends Father {
    public Son() {
        System.out.println("Son's constructer");
    }
}

public class Test4 {
    public static void main(String args[]) {
        new Son();
    }
}
