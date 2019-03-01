package com.runningsss.cloud;


import org.junit.Test;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

    }

    public static void main(String[] args) {

        final CountDownLatch begin = new CountDownLatch(1); //为0时开始执行
        final ExecutorService exec = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final int NO = i + 1;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        begin.await(); //等待直到 CountDownLatch减到1
//                        Map <String, Object> map = HttpClientUtil.httpSend("http://localhost:9001/dept/get/1", null, null);
                        System.out.println(System.currentTimeMillis());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            exec.submit(runnable);
        }
        System.out.println("开始执行");
        begin.countDown(); // begin减一，开始并发执行
        exec.shutdown();
    }
}
