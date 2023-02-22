package com.RentCars.RentCars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SpringBootApplication
public class RentCarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentCarsApplication.class, args);
	}
	@Configuration
	public class MyWebMvcConfigurer implements WebMvcConfigurer {

		@Override
		public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
			MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
			converters.add(converter);
		}

	}

}
