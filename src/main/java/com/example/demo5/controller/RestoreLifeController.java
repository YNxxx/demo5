package com.example.demo5.controller;


import com.example.demo5.util.CommonReturnType;
import com.example.demo5.util.Halcmd;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin

public class RestoreLifeController {
    @PostMapping("/RestoreLife")
    public @ResponseBody CommonReturnType getRestoreLife(@RequestParam("TestStation[]") int[] TestStation) {
        System.out.println("TestStation.length = " + TestStation.length);
        for (int i = 0; i < TestStation.length; i++) {
            if(TestStation[i] == 1) {
                Halcmd.halcmdsets(("RestoreLife" + i) ,1);
            }else {
                Halcmd.halcmdsets(("RestoreLife" + i) ,0);
            }
        }
        return new CommonReturnType("1","修改成功",null);

    }
}
