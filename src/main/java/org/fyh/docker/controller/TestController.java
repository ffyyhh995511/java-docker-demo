package org.fyh.docker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fangyunhe
 * @version 1.0
 * @Description
 * @time 2020/9/21 16:26
 */
@Slf4j
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${spring.profiles.active}")
    private String env;

    @RequestMapping("one")
    public Map<String, String> one(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("env", env);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        log.info("hashMap={}", hashMap);
        return hashMap;
    }

    @RequestMapping("two")
    public Map<String, String> two(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        log.error("hashMap={}", hashMap);
        return hashMap;
    }
}