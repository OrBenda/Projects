public class TwoThreads extends Thread{
    private int nextThread = 2;

    public synchronized void checkIfFree(int threadNumber) {
        while (nextThread <= threadNumber) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    public synchronized void imDone() {
        nextThread++;
        notifyAll();
    }
}
