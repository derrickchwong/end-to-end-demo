package com.example.demogemfireclient;

import org.apache.geode.pdx.PdxSerializer;
import org.apache.geode.pdx.ReflectionBasedAutoSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@SpringBootApplication
@ClientCacheApplication(locators = {@ClientCacheApplication.Locator(host = "gemfire1-locator", port = 10334)})
//@EnablePdx(serializerBeanName = "reflectionBasedAutoSerializer")
@EnableGemfireRepositories(basePackages = "com.example.demogemfireclient")
@EnableEntityDefinedRegions(basePackages = "com.example.demogemfireclient")
public class DemoGemfireClientApplication {

//	@Bean
//	PdxSerializer reflectionBasedAutoSerializer() {
//		return new ReflectionBasedAutoSerializer();
//	}
	public static void main(String[] args) {
		SpringApplication.run(DemoGemfireClientApplication.class, args);
	}

}
