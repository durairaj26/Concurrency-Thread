
    class A extends Thread{
        public void run(){
            for(int i=0;i<100;i++){
                System.out.println("hi");
            }
        }
    }

    class B extends Thread{
        public void run(){
            for(int i=0;i<100;i++){
                System.out.println("hello");
            }
        }
    }
public class ThreadsPriority {
    public static void main(String[] args) {
        A obj1= new A();
        B obj2= new B();
        obj2.setPriority(10);
        obj1.start();
        obj2.start();
    }

    
}
