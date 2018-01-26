package study.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @describe:
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月26日下午3:19:47
 */
@RestController
@SpringBootApplication
public class App {

	@RequestMapping("/")
	String home() {

		return "Hello World";
	}

	public static void main(String[] args) {

		SpringApplication.run(App.class, args);
	}
}
