package com.utah.common;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author zhuyin
 * @Date 2020/10/27 16:27
 * @Version V1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();

    }

}
