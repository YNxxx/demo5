package com.example.demo5.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 类描述：
 *
 * @ClassName TestController$
 * @Description TODO $ $
 * @Author Administrator$
 * @Date 2022/8/2$ 8:30$
 * @Version 1.0
 */

public class TestController {

    //首先要执行你要执行的linux命令
    public void test() throws Exception {

        String uKey="sudo halcmd gets zzzc";
        //执行该命令
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(uKey);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedInputStream in = new BufferedInputStream(process.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        // 定义shell返回值
        String result = null;
        String lineStr;
        while ((lineStr = br.readLine()) != null) {
            result = lineStr;
        }
        System.out.println(result+"执行的结果"+result);
        int i1 = process.waitFor();
        System.out.println("测试直接回调后的结果"+i1);

    }

}
