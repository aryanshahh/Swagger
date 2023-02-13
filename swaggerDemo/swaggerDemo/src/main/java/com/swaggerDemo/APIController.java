package com.swaggerDemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class APIController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/get")
	public String getRequest() {
		return "Swagger API successfully done";
	}
	
	@PostMapping("/api/posts")
    public String postRequest(@RequestBody String yourName) {
        return "Hello" + yourName + ", your API is successfully done";
    }
}