package xyz.cglzwz.msuser2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/print")
    public String print() {
        // 调用ms-user1应用的一个显示Hello功能
        return restTemplate.getForObject("http://ms-user1/test", String.class);
    }
}
