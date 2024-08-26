package virtual_thread_practice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.currentThread;

@Slf4j
@RestController
public class TestController {

    @PostMapping("/test")
    public void test() throws InterruptedException {
        Thread.sleep(50);
        log.info(String.valueOf(currentThread()));
    }
}
