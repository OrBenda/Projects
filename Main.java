public class Main {

    public static void main(String[] args) {
        HeavyThread[] threads = new HeavyThread[100];
        TwoThreads monitor = new TwoThreads();

        // init hardworking threads
        for (int i = 0; i < 100; i++)
            threads[i] = new HeavyThread(i, monitor);

        // run threads
        for (int i = threads.length - 1; i >= 0 ; i--)
            threads[i].start();
    }
}
