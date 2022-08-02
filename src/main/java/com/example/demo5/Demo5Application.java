package com.example.demo5;

import com.example.demo5.util.Halcmd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.Scanner;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Demo5Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Demo5Application.class, args);
//        while (true) {
//            System.out.println("Please input signal name:");
//            Scanner scanner = new Scanner(System.in);
//            String next = scanner.next();
//            System.out.println("ResVal = " + Halcmd.halcmdgets_s32(next));
//
//
//        }

    }

}
