package virtual_thread_practice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class PerformanceController {

    @GetMapping("/performance")
    public void performance() throws InterruptedException {
        log.info("Thread Info : {}", Thread.currentThread());
        Thread.sleep(300);
    }
}
