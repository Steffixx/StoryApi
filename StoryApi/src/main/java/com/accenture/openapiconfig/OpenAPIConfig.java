package com.accenture.openapiconfig;

//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.oas.annotations.EnableOpenApi;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@EnableOpenApi
//@Configuration
//public class OpenAPIConfig {
//	
//	//1:10 - 1:30 of Session 10, 19-07-2021 Part B 1:10 - 1:30 of Session 10, 19-07-2021 Part B
//
//	@Bean
//	public Docket config()
//	{
//		
//		Contact contact = new Contact("Steffi", "http://google.com", "stxffx98@gmail.com");
//		Collection<VendorExtension> vendors = new ArrayList<>();
//		ApiInfo info = new ApiInfo("Employee API", "Employee Management System", "0.0.1", "http://myterms.com", contact, "", "", vendors );
//		return new Docket(DocumentationType.OAS_30)
//				.apiInfo(info)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.accenture"))
//				.build();
//	}
//}
