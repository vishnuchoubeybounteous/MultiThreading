package MyExecuter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewExecuter {
    public static void main(String args[]){
    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.submit(() -> {
        System.out.println("Task 1 by " + Thread.currentThread().getName());
    });
    executor.submit(() -> {
        System.out.println("Task 2 by " + Thread.currentThread().getName());
    });
    executor.submit(() -> {
        System.out.println("Task 3 by " + Thread.currentThread().getName());
    });

    executor.shutdown();
    
}}
