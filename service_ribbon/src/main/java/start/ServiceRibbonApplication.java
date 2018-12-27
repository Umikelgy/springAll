package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/9/5 14:29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceRibbonApplication {
    public static void main(String[]args){
        SpringApplication.run(ServiceRibbonApplication.class,args);
    }
    @Bean
    @LoadBalanced//注册表明，这个restTemplate需要负载均衡
   public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
