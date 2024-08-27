package virtual_thread_practice.test;

import java.util.ArrayList;
import java.util.List;

public class ThreadCreationV1 {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        long startMs = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            Thread thread = new Thread(() -> {});
            threads.add(thread);
        }

        threads.forEach(Thread::start);
        long endMs = System.currentTimeMillis();

        System.out.println(endMs - startMs);
    }
}
