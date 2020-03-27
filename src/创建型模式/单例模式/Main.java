package 创建型模式.单例模式;

import 创建型模式.单例模式.懒汉式_不安全.Singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * 单例模式：产生一个全局唯一的单例对象，需要保证创建时的线程安全。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int threadCount = 2000;
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(threadCount);
        Set<Singleton> instances = Collections.synchronizedSet(new HashSet<>());
        for (int i = 0; i < threadCount; i ++) {
            new Thread(() -> {
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Singleton instance = Singleton.getInstance();
                instances.add(instance);

                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();

        boolean safe = instances.size() == 1;
        if (safe) {
            System.out.println("安全的单例！");
        } else {
            System.out.println("不安全的单例：" + instances);
        }
    }
}