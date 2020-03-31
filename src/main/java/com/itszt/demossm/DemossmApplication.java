package com.itszt.demossm;





import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication(scanBasePackages = "com.itszt")
@MapperScan(basePackages = "com.itszt.repositery")
@EnableTransactionManagement
public class DemossmApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemossmApplication.class, args);
    }

}
