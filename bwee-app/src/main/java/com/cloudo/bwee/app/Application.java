package com.cloudo.bwee.app;


import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.cloudo.bwee")
@EnableJpaRepositories(basePackages = "com.cloudo.bwee.repository")
@EnableEncryptableProperties
@EntityScan("com.cloudo.bwee.domain")
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("bowen系统启动");
    }

//    @Bean
//    public CommandLineRunner demo(SysInfoRepository sysInfoRepository){
//        return (args) -> {
//
//        }
//    }


}
