package kxr.design.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("kxr.design.ssm.mapper")
public class Kxr20204073234SsmDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(Kxr20204073234SsmDesignApplication.class, args);
    }
}
