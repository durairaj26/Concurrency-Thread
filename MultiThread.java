class A {
    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
        }
    }
}

class B {
    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }
}

public class MultiThread {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.show();
        obj2.show();

    }
}