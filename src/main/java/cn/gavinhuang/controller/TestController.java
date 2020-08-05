package cn.gavinhuang.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @PostMapping("/api/hello")
    public String hello(@RequestBody JSONObject data){
        String name = data.get("name").toString();
        return "hello" + name;
    }

    @GetMapping("/api/hello/world")
    public String helloWorld(){
        return "hello https!";
    }
}
