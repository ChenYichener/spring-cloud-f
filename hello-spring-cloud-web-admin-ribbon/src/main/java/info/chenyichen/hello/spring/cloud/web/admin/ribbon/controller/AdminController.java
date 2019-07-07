package info.chenyichen.hello.spring.cloud.web.admin.ribbon.controller;

import info.chenyichen.hello.spring.cloud.web.admin.ribbon.service.AdminRemotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: 陈一臣   <a href='mailto:chenyichenmail@163.com'></a>
 * @Description:
 * @Date: 2019/7/6 21:11
 */
@RestController
public class AdminController {

    @Autowired
    private AdminRemotoService adminRemotoService;

    @GetMapping
    public String sayHi (String msg) {
        return adminRemotoService.sayHi(msg);
    }
}
