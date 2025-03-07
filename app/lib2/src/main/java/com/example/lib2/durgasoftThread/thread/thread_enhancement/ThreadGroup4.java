package com.example.lib2.durgasoftThread.thread.thread_enhancement;

/**
 * Created by Vijay on 31-08-2023.
 */
public class ThreadGroup4 {
    public static void main(String[] args) {
        ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
        Thread[] t = new Thread[system.activeCount()];
        system.enumerate(t);
        for (Thread t1 : t) {
            System.out.println(t1.getName() + "...." + t1.isDaemon());
        }
    }
}
