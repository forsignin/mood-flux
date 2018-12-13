package com.mood.flux;

import com.mood.flux.utils.BaseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.mood.flux.mapper",markerInterface = BaseMapper.class)
public class MoodFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoodFluxApplication.class, args);
	}
}
