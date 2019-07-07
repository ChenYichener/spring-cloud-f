package info.chenyichen.hello.spring.cloud.web.admin.feign.service.hystrix;

import info.chenyichen.hello.spring.cloud.web.admin.feign.service.AdminRemotoService;
import org.springframework.stereotype.Component;

/**
 * @Author: 陈一臣   <a href='mailto:chenyichenmail@163.com'></a>
 * @Description:
 * @Date: 2019/7/6 21:47
 */
@Component
public class AdminRemotoServiceHystrix implements AdminRemotoService {

    @Override
    public String sayHi(String msg) {
        return "bad request";
    }
}
