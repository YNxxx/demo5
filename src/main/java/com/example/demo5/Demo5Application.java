package com.example.demo5;

import com.example.demo5.util.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Demo5Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Demo5Application.class, args);
        TestController testController = new TestController();
        long curTime3 = System.nanoTime();
        testController.test();
        System.out.println("Calendar.getInstance().getTimeInMillis()    " + Calendar.getInstance().getTimeInMillis() + " 耗时(ns)：" + (System.nanoTime() - curTime3)*1000000);
    }

}
