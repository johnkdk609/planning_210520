package com.planning.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.planning.test.bo.TestBO;

@Controller
public class TestController {

	@Autowired
	private TestBO testBO;
	
	@ResponseBody
	@RequestMapping("/test1/1")
	public String helloWorld() {
        return "Hello world!";
    }
	
	@RequestMapping("/test1/2")
	public String hello() {
		return "lesson01/ex01";
	}
	
	@ResponseBody
	@RequestMapping("/map")
	public Map<String, Object> map() {		// Map에는 꼭 <>로 해서 제네릭을 넣어줘야 한다.
		Map<String, Object> map = new HashMap<>();		// 선언을 꼭 해준다!
		map.put("status", "student");
		map.put("age", 27);
		map.put("major", "PA");
		map.put("level", "blue");
		return map;
	}
	
	@RequestMapping("/test2")
	@ResponseBody
	public List<Map<String, Object>> test2() {
		return testBO.getUserList();
	}
	
}
