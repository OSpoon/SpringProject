package tech.tena.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 命令启动多个服务
 * java -jar eureka-server-0.0.1-SNAPSHOT.jar
 * java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
 * java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
