package info.chenyichen.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 陈一臣   <a href='mailto:chenyichenmail@163.com'></a>
 * @Description:
 * @Date: 2019/7/6 19:33
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/sayHi")
    public String sayHi(String msg) {
        return String.format("Hi your message is : %s  port: %s", msg, port);
    }
}
