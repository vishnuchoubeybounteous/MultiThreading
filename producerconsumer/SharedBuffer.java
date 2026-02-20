package producerconsumer;

public class SharedBuffer {
    private int data;
    private boolean available = false; // flag to indicate data availability

    // Producer puts data
    public synchronized void produce(int value) {
        while (available) { // wait if data not consumed yet
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify(); // notify consumer
    }

    // Consumer gets data
    public synchronized void consume() {
        while (!available) { // wait if no data
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // notify producer
    }
}
