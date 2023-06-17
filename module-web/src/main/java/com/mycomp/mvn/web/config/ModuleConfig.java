package com.mycomp.mvn.web.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.mycomp.mvn.*"})
@EntityScan(basePackages = {"com.mycomp.mvn.*"})
@EnableJpaRepositories(basePackages = {"com.mycomp.mvn.*"})
public class ModuleConfig {
}
