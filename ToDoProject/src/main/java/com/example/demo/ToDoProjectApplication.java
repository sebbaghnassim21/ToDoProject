package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Model.Profil;
import com.example.demo.Model.ProfilRepository;

@SpringBootApplication
public class ToDoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoProjectApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProfilRepository profilRepository) {
		return args ->{
			Profil p =new Profil();
			p.setName("nassim");
			p.setEmail("nassim_nassim21@yahoo.fr");
			profilRepository.save(p);
			Profil p2 =new Profil();
			p2.setName("lokman");
			p2.setEmail("lokman&@yahoo.fr");
			profilRepository.save(p2);
	
		};
		
		
	}

}
