package example.springboot.hello.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    /**
     * Logger
     */
    private final Logger logger = LoggerFactory.getLogger(HelloService.class);

    /**
     * Helloを書き出す
     */
    public void say(){
        logger.info("Hello!");
    }
}
