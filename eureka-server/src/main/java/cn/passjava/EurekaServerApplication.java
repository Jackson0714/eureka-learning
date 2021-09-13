package cn.passjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: 公众号 | 悟空聊架构
 * @Date: 2021/9/13 7:28
 * @Site: www.passjava.cn
 * @Github: https://github.com/Jackson0714/eureka-learning
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
