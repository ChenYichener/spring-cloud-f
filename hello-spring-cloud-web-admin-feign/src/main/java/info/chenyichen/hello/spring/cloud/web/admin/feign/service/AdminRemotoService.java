package info.chenyichen.hello.spring.cloud.web.admin.feign.service;

import info.chenyichen.hello.spring.cloud.web.admin.feign.service.hystrix.AdminRemotoServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 陈一臣   <a href='mailto:chenyichenmail@163.com'></a>
 * @Description:
 * @Date: 2019/7/6 21:30
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminRemotoServiceHystrix.class)
public interface AdminRemotoService {

    @GetMapping("/sayHi")
    String sayHi(@RequestParam("msg") String msg);
}