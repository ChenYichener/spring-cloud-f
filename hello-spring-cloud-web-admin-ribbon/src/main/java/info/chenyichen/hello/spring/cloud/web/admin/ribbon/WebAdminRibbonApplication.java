package info.chenyichen.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 陈一臣   <a href='mailto:chenyichenmail@163.com'></a>
 * @Description:
 * @Date: 2019/7/6 19:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebAdminRibbonApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
