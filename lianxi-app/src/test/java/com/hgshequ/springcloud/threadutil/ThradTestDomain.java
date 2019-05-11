package com.hgshequ.springcloud.threadutil;

import io.netty.util.concurrent.DefaultThreadFactory;

import java.util.concurrent.*;

/**
 * @author : Sunny
 * @version V1.0
 * @Project: lianxi
 * @Package com.hgshequ.springcloud.threadutil
 * @Description: TODO
 * @date Date : 2019年05月10日 12:26
 */
public class ThradTestDomain {

    public static void main(String[] args) {
        /**
         *                              int corePoolSize,
         *                               int maximumPoolSize,
         *                               long keepAliveTime,
         *                               TimeUnit unit,
         *                               BlockingQueue<Runnable> workQueue,
         *                               ThreadFactory threadFactory,
         *                               RejectedExecutionHandler handler
         *
         *
         * AbortPolicy：直接抛出异常，默认策略；
         * CallerRunsPolicy：用调用者所在的线程来执行任务；
         * DiscardOldestPolicy：丢弃阻塞队列中靠最前的任务，并执行当前任务；
         * DiscardPolicy：直接丢弃任务；
         */
        ExecutorService service = new ThreadPoolExecutor(1, 2, 60L, TimeUnit.SECONDS
                , new LinkedBlockingQueue<>(1000), new DefaultThreadFactory("ThradTestDomain-pool"),
                new ThreadPoolExecutor.AbortPolicy());

        Executors.newFixedThreadPool(1);
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(2);
        Executors.newSingleThreadExecutor();

        Thread thread = new Thread();
     }
}
