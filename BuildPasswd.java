package cn.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @创建人：zhouyang
 * @创建时间：2020/4/23 16:05
 * @version：V1.0
 */
public class BuildPasswd {
    public static void main(String[] args){
        System.out.println(new BCryptPasswordEncoder(10).encode("123"));
    }
}
