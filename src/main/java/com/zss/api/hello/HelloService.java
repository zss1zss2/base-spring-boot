package com.zss.api.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    Hello getHelloById(String id){
        return helloRepository.getHelloById(id);
    }
}
