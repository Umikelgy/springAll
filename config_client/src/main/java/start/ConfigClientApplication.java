package start;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *@descripion:
 *
 *@author 10068921(LgyTT)
 *@date 2018/9/5 9:02
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigClientApplication {
    public static void main(String []args){
        SpringApplication.run(ConfigClientApplication.class,args);
    }
    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String hello(){
        return "Hello word from port"+port;
    }
}
