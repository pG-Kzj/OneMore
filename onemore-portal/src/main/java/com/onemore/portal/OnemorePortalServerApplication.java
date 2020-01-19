package com.onemore.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.onemore.portal.mapper")
public class OnemorePortalServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnemorePortalServerApplication.class, args);
	}

}
