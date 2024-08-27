package virtual_thread_practice.document;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThreadDocumentExample {

    public static void main(String[] args) throws Exception {
        // 예제 1
        Thread thread = Thread.ofVirtual()
                .start(() -> System.out.println("Hello : " + Thread.currentThread()));

        thread.join();

        // 예제 2
        try (ExecutorService myExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<?> future = myExecutor.submit(() -> System.out.println("Running thread : " + Thread.currentThread()));
            future.get();
            System.out.println("Task completed : " + Thread.currentThread());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
