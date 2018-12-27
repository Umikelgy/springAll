package start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import start.fs;

/**
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/12/27 9:42
 */
@RestController
public class TestCLIController {
    @RequestMapping("cli")
    public String cli(){
        return new fs().fscs();
    }
}
