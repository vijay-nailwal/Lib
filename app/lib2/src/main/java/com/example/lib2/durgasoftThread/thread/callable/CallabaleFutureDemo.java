package com.example.lib2.durgasoftThread.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Vijay on 01-09-2023.
 */
class MyCallable implements Callable {
    int num;

    MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "is... responsible to find sum of first " + num + " numbers ");
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

public class CallabaleFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable[] jobs = {
                new MyCallable(10),
                new MyCallable(20),
                new MyCallable(30),
                new MyCallable(40),
                new MyCallable(50),
                new MyCallable(60),
        };
        ExecutorService service= Executors.newFixedThreadPool(3);
        for(MyCallable job:jobs){
            Future f=service.submit(job);
            System.out.println(f.get());        }
        service.shutdown();
    }
}
