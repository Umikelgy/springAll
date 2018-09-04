package start;

/*
 *@author LgyTT@alog.com
 *@date 2018/8/20 17:07
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

  //  @Value("${AC}")
   // String hello;
    @Value("${HSC}")
    String hsc;
    @RequestMapping(value = "/AC")
    public String hello(){
        return "AC";
    }
    @RequestMapping(value = "/HSC")
    public String HSC( ){
        return hsc;
    }
}
