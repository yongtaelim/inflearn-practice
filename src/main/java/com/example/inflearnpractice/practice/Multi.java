package com.example.inflearnpractice.practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.CompletableFuture;

@Slf4j
public class Multi {

    public void run(final int loopCount) throws InterruptedException {

        for (int i = 0; i < loopCount; i++) {
            CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
            completableFuture.
             multiRun(completableFuture);

        }
    }

    @Async
    public void multiRun(CompletableFuture<Integer> completableFuture) throws InterruptedException {
        log.info("multi start index : " + index);
        Thread.sleep(3000L);
        log.info("multi end index : " + index);
        CompletableFuture<Integer> completableFuture = new CompletableFuture<>();
        completableFuture.complete(index);

    }
}
