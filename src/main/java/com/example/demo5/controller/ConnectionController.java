package com.example.demo5.controller;

import com.example.demo5.util.CommonReturnType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类描述：
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
    @PostMapping("/CommandDataType_WorkMode")
    public @ResponseBody
    CommonReturnType adminLogin() {
        return new CommonReturnType("10003", "Wrong user name or password", null);

    }
}
