package start;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@descripion:
 *
 *@author 10068921(LgyTT)
 *@date 2018/9/5 9:16
 */
@SpringBootApplication
@RestController
public class EurekaClientApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaClientApplication.class,args);
    }
    @Value("${hello}")
    private String hello;
    @RequestMapping("/hello")
    public String hello(){
        return hello;
    }
}
