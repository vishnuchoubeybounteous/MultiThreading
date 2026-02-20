package MyExecuter;

import java.util.concurrent.*;
import java.util.concurrent.Executors;

public class NewExecuter {
    public static void main(String args[]) throws Exception{
    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.submit(() -> {
        System.out.println("Task 1 by " + Thread.currentThread().getName());
    });
    executor.submit(() -> {
        System.out.println("Task 2 by " + Thread.currentThread().getName());
    });
    Future<Integer> obj=executor.submit(() -> {
        System.out.println("Task 3 by " + Thread.currentThread().getName());
        return 10;
    });
     System.out.println(obj.get());
    executor.shutdown();
    
}}
