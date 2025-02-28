package com.git.ex02.conf;

import com.git.ex02.conponent.AA;
import com.git.ex02.conponent.BB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public AA aa() {
        return new AA();
    }

    @Bean
    public BB bb() {
        return new BB();
    }
}
