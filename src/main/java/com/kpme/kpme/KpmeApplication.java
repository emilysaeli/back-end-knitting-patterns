package com.kpme.kpme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

import static com.kpme.kpme.Row.generateRow;
import static com.kpme.kpme.Row.parsePattern;

@SpringBootApplication
public class KpmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KpmeApplication.class, args);

	}

}
