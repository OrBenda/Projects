public class HeavyThread extends Thread{
    private int id;
    private TwoThreads thread;

    public HeavyThread(int id, TwoThreads thread) {
        this.id = id;
        this.thread = thread;
    }

    @Override
    public void run() {
        super.run();
        thread.checkIfFree(id);
        System.out.println(id + " is an hard workin' thread!");
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.imDone();
    }
}
