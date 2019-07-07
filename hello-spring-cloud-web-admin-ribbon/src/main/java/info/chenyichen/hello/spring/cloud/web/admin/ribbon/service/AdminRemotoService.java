package info.chenyichen.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 陈一臣   <a href='mailto:chenyichenmail@163.com'></a>
 * @Description:
 * @Date: 2019/7/6 21:09
 */
@Service
public class AdminRemotoService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String msg) {
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/sayHi?msg=" + msg, String.class);
    }
}
