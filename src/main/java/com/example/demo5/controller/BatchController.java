package com.example.demo5.controller;

import com.example.demo5.util.CommonReturnType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author yangning
 * @Description //TODO $
 * @Date $ $
 * @Param $
 * @return $
 **/

@Controller
@CrossOrigin
public class BatchController {

    @PostMapping("/CommandDataType_StartLot")
    public @ResponseBody
    CommonReturnType startBatch(@RequestParam("LotSize") String LotSize,
                                @RequestParam("PPID") String PPID,@RequestParam("TestStep") String TestStep,
                                @RequestParam("LotID") String LotID,@RequestParam("fileName") String fileName,
                                @RequestParam("reelNumStation_1") String reelNumStation_1,@RequestParam("reelNumStation_2") String reelNumStation_2) {



        return new CommonReturnType("10003", "Wrong user name or password", null);
    }

    @PostMapping("/EndLot/CommandDataType_EndLot")
    public @ResponseBody
    CommonReturnType endBatch(@RequestParam("SummaryFileName") String SummaryFileName) {

        return new CommonReturnType("10003", "Wrong user name or password", null);
    }
}
