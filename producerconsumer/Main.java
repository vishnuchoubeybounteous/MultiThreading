package producerconsumer;

public class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producerThread = new Thread(new Producer(buffer), "Producer");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer");

        producerThread.start();
        consumerThread.start();
    }
}