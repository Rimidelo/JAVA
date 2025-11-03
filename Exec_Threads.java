public class Exec_Threads implements Runnable {
    private Counter counter;
    private static final int ITERATIONS = 1000;

    public Exec_Threads(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        int tid = ThreadID.get();

        if (tid % 2 == 0) {
            for (int i = 0; i < ITERATIONS; i++) {
                counter.inc();
                try {
                    Thread.sleep(0, 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = 0; i < ITERATIONS; i++) {
                counter.dec();
                try {
                    Thread.sleep(0, 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


