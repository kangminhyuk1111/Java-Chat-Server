package com.djawnstj.chat.tester;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/tester")
    public String testPage() {
        return "tester/stomp-test";
    }
}
