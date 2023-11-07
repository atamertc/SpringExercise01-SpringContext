package com.atamertc;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class HesaplamaOrnegi {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HesaplamaOrnegi.class);

		System.out.println("--------------------------------------------");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("--------------------------------------------");

		System.out.println(context.getBean(HesaplamaServisi.class).maxBul());


	}

}
