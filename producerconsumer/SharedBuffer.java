package producerconsumer;

public class SharedBuffer {
    private int data;
    private boolean available = false; 

 
    public synchronized void produce(int value) {
        if(available) { 
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

   
    public synchronized void consume() {
        if(!available) { 
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); 
    }
}
