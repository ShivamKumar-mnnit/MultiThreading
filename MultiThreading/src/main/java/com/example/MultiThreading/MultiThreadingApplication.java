package com.example.MultiThreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiThreadingApplication {

	public static void main(String[] args) {

		SpringApplication.run(MultiThreadingApplication.class, args);

		World world = new World();
		world.start();

		for(int i=0;i<10000;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
