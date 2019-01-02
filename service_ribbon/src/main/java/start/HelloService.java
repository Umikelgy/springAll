package start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/9/5 14:35
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    public String getHelloContent(){
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/",String.class);
    }
}
