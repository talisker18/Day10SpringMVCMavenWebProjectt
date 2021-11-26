package Day10.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/") //see web.xml servlet mapping: <url-pattern>/</url-pattern>, so we give here the url for the spring-servlet.xml
	public String display() {
		return "index"; //return index.jsp
		//return "Hello world";
	}

}
