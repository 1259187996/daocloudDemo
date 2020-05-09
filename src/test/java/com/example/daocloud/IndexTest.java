package com.example.daocloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IndexTest {

    @Autowired
    private IndexService indexService;

    @Test
    public void index(){
        indexService.sayHello();
    }
}
