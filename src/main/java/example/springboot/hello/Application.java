package example.springboot.hello;

import example.springboot.hello.services.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        // Spring boot Applicationの実行
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        // Componentの取り出し
        HelloService service = context.getBean(HelloService.class);
        // サービスを実行
        service.say();
    }
}
