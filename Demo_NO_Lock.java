public class Demo_NO_Lock {
    public static void main(String[] argv) {
        System.out.println("In main() Demo_NO_Lock");
        
        Counter counter = new Counter();
        Exec_Threads eT = new Exec_Threads(counter);
        
        Thread thread1 = new Thread(eT);
        Thread thread2 = new Thread(eT);
        
        thread2.start();
        thread1.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        if (counter.get() == 0)
            System.out.println("\nCounter final value: " + counter.get());
        else
            System.err.println("\n*!*!*!*! Counter final value: " +
                    counter.get() + " ==> NOT = 0");
        
        System.out.println("\nExiting main() Demo_NO_Lock");
    }
}


