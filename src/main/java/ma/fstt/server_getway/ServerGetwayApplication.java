package ma.fstt.server_getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerGetwayApplication.class, args);
    }

}
