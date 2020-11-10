package com.software.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/11/10
 * @description
 */
@RestController
@RequestMapping("/info")
@RefreshScope
public class InfoController {
    @Value("${sql.name}")
    private String name;

    @Value("${sql.version}")
    private String version;

    @GetMapping("/get")
    public Object get() {

        return "名称：" + name + ", 版本：" + version;
    }
}
