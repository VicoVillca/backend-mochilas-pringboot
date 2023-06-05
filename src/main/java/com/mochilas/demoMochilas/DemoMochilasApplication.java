package com.mochilas.demoMochilas;

import com.mochilas.demoMochilas.entity.Category;
import com.mochilas.demoMochilas.repository.CategoryRepository;
import com.mochilas.demoMochilas.service.CategoryService;
import com.mochilas.demoMochilas.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMochilasApplication  {

	@Autowired
	private CategoryRepository categoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoMochilasApplication.class, args);
		System.out.println("Hola Buenos dias weeee");
	}



}
