package com.zss.api.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello/{id}")
    public ResponseEntity getHello(@PathVariable String id) {
        Hello helloById = helloService.getHelloById(id);
        System.out.println(helloById);
        return ResponseEntity.ok(helloById);
    }
}
