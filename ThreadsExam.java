class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
    }
}

public class ThreadsExam {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }
}
