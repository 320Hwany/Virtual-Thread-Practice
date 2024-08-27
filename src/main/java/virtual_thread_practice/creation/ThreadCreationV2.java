package virtual_thread_practice.creation;

import java.util.ArrayList;
import java.util.List;

public class ThreadCreationV2 {

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        long startMs = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            Thread thread = Thread.ofVirtual().unstarted(() -> {});
            threads.add(thread);
        }

        threads.forEach(Thread::start);

        long endMs = System.currentTimeMillis();
        System.out.println(endMs - startMs);
    }
}
