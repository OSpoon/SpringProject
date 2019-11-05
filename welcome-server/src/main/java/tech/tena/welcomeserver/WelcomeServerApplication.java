package tech.tena.welcomeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 命令启动:
 * java -jar welcome-server-0.0.1-SNAPSHOT.jar --server.port=8001
 * java -jar welcome-server-0.0.1-SNAPSHOT.jar --server.port=8002
 */
@EnableDiscoveryClient
@SpringBootApplication
public class WelcomeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeServerApplication.class, args);
    }

}
