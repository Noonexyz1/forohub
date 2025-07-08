package com.forohub.infrastructure.http.rest.config;

import com.forohub.application.adapter.ForohubAdapter;
import com.forohub.application.port.in.ForohubService;
import com.forohub.application.port.out.persistence.ForohubPersistenceAbstract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Autowired
    private ForohubPersistenceAbstract forohubPersistenceAbstract;

    @Bean
    public ForohubService forohubServiceBean() {
        return new ForohubAdapter(forohubPersistenceAbstract);
    }

}
