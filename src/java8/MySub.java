package java8;

class MySuper {
    static {
        System.out.println("I am SUPER static");
    }

    public MySuper() {
        System.out.println("I am SUPER constructor");
    }
}

public class MySub extends MySuper {
    static {
        System.out.println("I am SUB static");
    }

    public MySub() {
        System.out.println("I am SUB constructor");
    }

    public static void main(String args[]) {
        MySub mySub_first = new MySub();
        MySub mySub_second = new MySub();
    }
}
