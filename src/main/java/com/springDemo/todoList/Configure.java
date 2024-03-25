package com.springDemo.todoList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

    @Bean
    public ThirdParty thirdPartyService() {
        return new ThirdParty();
    }

}
