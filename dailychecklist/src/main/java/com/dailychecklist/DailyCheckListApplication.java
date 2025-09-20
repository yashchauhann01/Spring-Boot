package com.dailychecklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyCheckListApplication {

	public static void main(String[] args) {
        System.out.println("I'm running my first ever Spring application");
        SpringApplication.run(DailyCheckListApplication.class, args);
	}
}
