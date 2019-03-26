package xyz.cglzwz.msspringcloud;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsSpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsSpringcloudApplication.class, args);
    }

}
