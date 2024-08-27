package virtual_thread_practice.blocking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadBlocking {

    @GetMapping("/thread-blocking")
    public void blocking() throws InterruptedException {
        // 1초 소요
        Thread.sleep(1000);
    }
}
