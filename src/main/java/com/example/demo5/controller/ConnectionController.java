package com.example.demo5.controller;

import com.example.demo5.util.CommonReturnType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类描述：是否连接
 *
 * @ClassName $NAME
 * @Description TODO $START $END
 * @Author $YANGNING
 * @Date $DATE $TIME
 * @Version 1.0
 */

@Controller
@CrossOrigin
public class ConnectionController {
    @PostMapping("/WorkMode")
    public @ResponseBody
    CommonReturnType workMode(@RequestParam("OperateMode") String OperateMode) {

        if ("Remote".equals(OperateMode))
        {
            //开启
            return new CommonReturnType("0", null, null);
        } else if ("Local".equals(OperateMode)) {
            //关闭
            return new CommonReturnType("0", null, null);
        }

        return new CommonReturnType("1001", "Error in passed parameter", null);

    }
}
