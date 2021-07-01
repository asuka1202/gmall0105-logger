package com.atguigu.gmall0105.logger.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class loggerController {
    @RequestMapping("/applog")
    public String applog(@RequestBody String logString) {
        System.out.println(logString);
        log.info(logString);
        return logString;
    }
}
