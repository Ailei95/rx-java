package io.ninjabet.rxjava;

import io.ninjabet.rxjava.consumer.GreetingWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RxJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RxJavaApplication.class, args);

        GreetingWebClient gwc = new GreetingWebClient();
        System.out.println(gwc.getResult());
    }
}
