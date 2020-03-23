package me.sarthak.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
//		This Works too:
//		return "<h1>Hi</h1>";
		return "Hi";
	}
}
