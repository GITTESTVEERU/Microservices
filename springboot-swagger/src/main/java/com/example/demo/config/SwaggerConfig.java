package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	/*@Bean Ist Step
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(regex("/rest.*"))
				.build();

	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("JavaInUse API")
				.description("Spring boot with Swagger")
				.termsOfServiceUrl("http://Laratechnologies.com")
				.contact("lara@gmail.com").license("Lara License")
				.licenseUrl("lara@gmail.com").version("1.0").build();
	}*/
	
	
	
	/*@Bean IInd Step
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(regex("/rest.*"))
				.build()
				.apiInfo(metaInfo());

	}
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo("Lara Microservice Session", "Spring boot with Swagger", "1.0", 
				"http://Laratechnologies.com", "lara@gmail.com", "Lara License", "lara@gmail.com");
		
		return apiInfo;
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("JavaInUse API")
				.description("Spring boot with Swagger")
				.termsOfServiceUrl("http://Laratechnologies.com")
				.contact("lara@gmail.com").license("Lara License")
				.licenseUrl("lara@gmail.com").version("1.0").build();
	}*/
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(regex("/rest.*"))
				.build()
				.apiInfo(metaInfo());

	}
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo("Lara Microservice Session", "Spring boot with Swagger", "1.0", 
				"http://Laratechnologies.com", "lara@gmail.com", "Lara License", "lara@gmail.com");
		
		return apiInfo;
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("JavaInUse API")
				.description("Spring boot with Swagger")
				.termsOfServiceUrl("http://Laratechnologies.com")
				.contact("lara@gmail.com").license("Lara License")
				.licenseUrl("lara@gmail.com").version("1.0").build();
	}
}
