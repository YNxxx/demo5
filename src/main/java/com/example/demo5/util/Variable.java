package com.example.demo5.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 在这个类中定义一些全局变量
 *
 * @Author yangning
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/

@Component
@ConfigurationProperties(prefix = "connection")
public class Variable {
    private int OperateMode;

    public int getOperateMode() {
        return OperateMode;
    }

    public void setOperateMode(int operateMode) {
        OperateMode = operateMode;
    }
}
