package com.example.demo5.controller;

import com.example.demo5.pojo.ParaList;
import com.example.demo5.util.CommonReturnType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author yangning
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/

@Controller
@CrossOrigin
public class MotorController {

    @PostMapping("/Stop")
    public @ResponseBody
    CommonReturnType stopMotor(@RequestParam("code") String code,@RequestParam("Reason") String Reason) {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    @PostMapping("/Star ")
    public @ResponseBody
    CommonReturnType startMotor(@RequestParam("code") String code,@RequestParam("Reason") String Reason) {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    @PostMapping("/Lock")
    public @ResponseBody
    CommonReturnType lockMotor(@RequestParam("code") String code,@RequestParam("Reason") String Reason) {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    @PostMapping("/unLock")
    public @ResponseBody
    CommonReturnType unlockMotor(@RequestParam("code") String code,@RequestParam("Reason") String Reason) {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    /**
     * 获取实时信息
     */
    @GetMapping("/GetRealtimeInfo")
    public @ResponseBody
    CommonReturnType getRealtimeInfo() {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    /**
     * 上传配方
     */
    @PostMapping("/SubmitPP")
    public @ResponseBody
    CommonReturnType uploadFormula (@RequestParam("ParaGroup") String paraGroup,@RequestParam("ParaList") List<ParaList> paraList,
                                 @RequestParam("PPCreateDate") String pPCreateDate,@RequestParam("PPID") String pPID) {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    /**
     * 加载配方
     */
    @PostMapping("/LoadPP")
    public @ResponseBody
    CommonReturnType loadFormula(@RequestParam("ParaGroup") String paraGroup,@RequestParam("ParaList") List<ParaList> paraList,
                                 @RequestParam("PPCreateDate") String pPCreateDate,@RequestParam("PPID") String pPID) {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    /**
     * 获取当前配方
     */
    @GetMapping("/GetCurrentPP")
    public @ResponseBody
    CommonReturnType getFormula() {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    /**
     * 参数确认，修改后发送到XTRAN（未测试）
     */
    @GetMapping("/ParamConfirm")
    public @ResponseBody
    CommonReturnType getParamConfirm() {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    /**
     * 终端信息
     * @return
     */
    @GetMapping("/TerminalMessage")
    public @ResponseBody
    CommonReturnType getTerminalMessage() {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    /**
     * 设置系统时间
     */
    @PostMapping("/TerminalMessage")
    public @ResponseBody
    CommonReturnType setSystemTime(@RequestParam("SystemTime") String systemTime) {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }
}
