package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*
 *@descripion:
 *
 *@author 10068921(LgyTT)
 *@date 2018/9/5 9:09
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigServerApplication {
    public static void main(String[] args){
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}
