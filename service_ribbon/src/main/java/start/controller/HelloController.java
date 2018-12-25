package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import start.HelloService;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/9/5 14:58
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService service;
    @RequestMapping(value = "/tt")
    public String Hello(){
        return service.getHelloContent();
    }
}
