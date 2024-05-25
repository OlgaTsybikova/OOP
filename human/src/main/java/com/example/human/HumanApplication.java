package com.example.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);

		//Human tom = new Human();
		//tom.speak();
		Human human1 = new Human("Tom", 20);
		Human human2 = new Human("Jessica", 36);
		Human human3 = new Human("Xavi", 37);

		human1.speak();
		human2.speak();
		human3.speak();
	}

}
