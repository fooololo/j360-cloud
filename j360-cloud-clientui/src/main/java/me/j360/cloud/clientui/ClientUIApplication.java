package me.j360.cloud.clientui;

import com.netflix.config.ConcurrentMapConfiguration;
import org.apache.commons.configuration.AbstractConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class ClientUIApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientUIApplication.class, args);
    }


    @Bean
    public AbstractConfiguration sampleArchaiusConfiguration() throws Exception {
        ConcurrentMapConfiguration concurrentMapConfiguration = new ConcurrentMapConfiguration();
        concurrentMapConfiguration.addProperty("testkey", "testvalue");
        return concurrentMapConfiguration;
    }
}
