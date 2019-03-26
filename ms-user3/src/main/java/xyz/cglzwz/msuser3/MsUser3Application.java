package xyz.cglzwz.msuser3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsUser3Application {

    public static void main(String[] args) {
        SpringApplication.run(MsUser3Application.class, args);
    }

}
