package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/*
 *@author LgyTT@alog.com
 *@date 2018/8/22 16:27
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigGitServerApplication {
    public static void main(String []args){
        SpringApplication.run(ConfigGitServerApplication.class,args);
    }

}
