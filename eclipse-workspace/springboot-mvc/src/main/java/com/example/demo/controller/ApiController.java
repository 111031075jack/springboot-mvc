package com.example.demo.controller;

import java.util.Map;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/api")
public class ApiController {
	
	// 執行路徑: http://localhost:8080/api/hello
	@GetMapping("/hello")
	public String hello() {
		return "Hello Springboot";
	}
	
	// 執行路徑: http://localhost:8080/api/hi
	@GetMapping("/hi")
	public String hi() {
		return "Hi Springboot";
	}

	// 執行路徑: http://localhost:8080/api/bmi?h=170&w=60
	@GetMapping("/bmi")
	public String bmi(@RequestParam(name = "h") double h, @RequestParam double w) {
		double bmi = w / Math.pow(h/100, 2);
		return String.format("身高: %.1f 體重: %.1f BMI: %.2f", h, w, bmi);
	
	}
		
	// size=s or m or l or xl
	// sweet= 1分~10分糖
	// s(20元) m(25元) l(40元) xl(50元)
	// 執行路徑: http://localhost:8080/api/beverage?size=M&sweet=1&price=25
	@GetMapping("/beverage")
	public String beverage(@RequestParam(required = false, defaultValue = "XL") String size,
			@RequestParam(required = false, defaultValue = "10") Integer sweet){
		Map<String, Integer> priceMap = Map.of("S", 20, "M", 25, "L", 40, "XL", 50);
		return String.format("飲料 %s 杯, 甜度 %d 分 價格: %d 元", size, sweet, priceMap.get(size)); 
	}
	
	/**
	 * Lab 練習 I
	 * 路徑: /api/bmi2?h=170&w=60
	 * 網址: http://localhost:8080/api/bmi2?h=170&w=60
	 * 執行結果: 
	 * {
	 *   "message": "BMI 計算成功",
	 *   "data": {
	 *     "height": 170.0,
	 *     "weight": 60.0,
	 *     "bmi": 20.76
	 *   }
	 * }
	 * */
	
	
	
		
}
