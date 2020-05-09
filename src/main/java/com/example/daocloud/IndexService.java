package com.example.daocloud;

import org.springframework.stereotype.Service;

@Service
public class IndexService {

    public String sayHello(){
        System.out.println("hello daoCloud");
        return "hello daoCloud";
    }

}
