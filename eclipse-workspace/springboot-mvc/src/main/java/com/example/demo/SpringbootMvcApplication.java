/*
 * C:\Windows\system32>netstat -ano | findstr 8080
  TCP    192.168.10.78:8080     0.0.0.0:0              LISTENING       5000

C:\Windows\system32>taskkill /F /pid 5000
成功: 處理程序 PID 5000 已經終止了。
8080 被占用時 系統管理員開啟cmd輸入這指令
*/
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcApplication.class, args);
	}

}
