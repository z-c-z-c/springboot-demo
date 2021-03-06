package com.mm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mm.com.mm.hello.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author shmily
 * @date 2019/4/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {

    @Resource
    private HelloSender helloSender;

    @Test
    public void send() throws JsonProcessingException {
        helloSender.send();
    }
}
