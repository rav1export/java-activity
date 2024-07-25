package com._export_test.TestOnly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan
@EntityScan
@EnableJpaRepositories
public class TestOnlyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestOnlyApplication.class, args);
	}

}
