package com.example.demo5.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings({"all"})
public class Halcmd {
    public static int halcmdgets_bit(String name) {
        int resValue = -1;
        String cmd = "sudo halcmd gets " + name;
        try {
            String s = terminalCmd(cmd);
            if (s.equals("TRUE")) {
                return 1;
            } else if (s.equals("FALSE")) {
                return 0;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return resValue;
    }

    //double halcmdgets_float(const char *name);
    public static double halcmdgets_float(String name)  {
        double resValue = -1;
        String cmd = "sudo halcmd gets " + name;

        try {
            String s = terminalCmd(cmd);
            resValue = Double.parseDouble(s);
        } catch (Exception e) {
            return -1;
        }
        return resValue;
    }

//    int halcmdgets_s32(const char *name);

    public static int halcmdgets_s32(String name)  {
        int resValue = -1;
        String cmd = "sudo halcmd gets " + name;

        try {
            String s = terminalCmd(cmd);
            resValue = Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
        return resValue;
    }


    //    extern int halcmdgets_u32(const char *name);
    public static int halcmdgets_u32(String name) {
        int resValue = -1;
        String cmd = "sudo halcmd gets " + name;

        try {
            String s = terminalCmd(cmd);
            resValue = Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
        return resValue;
    }

    //    extern int halcmdgetp_bit(const char *name);
    public static int halcmdgetp_bit(String name) {
        int resValue = -1;
        String cmd = "sudo halcmd getp " + name;
        try {
            String s = terminalCmd(cmd);
            if (s.equals("TRUE")) {
                return 1;
            } else if (s.equals("FALSE")) {
                return 0;
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return resValue;
    }

    //    extern double halcmdgetp_float(const char *name);
    public static double halcmdgetp_float(String name){
        double resValue = -1;
        String cmd = "sudo halcmd getp " + name;
        try {
        String s = terminalCmd(cmd);
            resValue = Double.parseDouble(s);
        } catch (Exception e) {
            return -1;
        }
        return resValue;
    }

    //    extern int halcmdgetp_s32(const char *name);
    public static int halcmdgetp_s32(String name) {
        int resValue = -1;
        String cmd = "sudo halcmd getp " + name;

        try {
            String s = terminalCmd(cmd);
            resValue = Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
        return resValue;
    }

//    extern int halcmdgetp_u32(const char *name);
    public static int halcmdgetp_u32(String name)  {
        int resValue = -1;
        String cmd = "sudo halcmd getp " + name;

        try {
            String s = terminalCmd(cmd);
            resValue = Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
        return resValue;
    }

    //extern int halcmdsets(const char *name, const char *format, ...);
    public static int halcmdsets(String name,Object object) {
        int resValue = -1;
        String cmd = "sudo halcmd sets " + name + " " +object.toString();
        System.out.println(cmd);
        try {
            String s = terminalCmd(cmd);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resValue;
    }


    //extern int halcmdsetp(const char *name, const char *format, ...);

    public static int halcmdsetp(String name,Object object) {
        int resValue = -1;
        String cmd = "sudo halcmd setp " + name + " " +object.toString();
        try {
            String s = terminalCmd(cmd);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resValue;
    }


    public static String terminalCmd(String cmd) throws IOException, InterruptedException {
        String uKey = cmd;
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
//        System.out.println(result + "执行的结果" + result);
        return result;
    }
}
