package com.sparta.mg.springmvcsql;

import com.sparta.mg.springmvcsql.entities.UserEntity;
import com.sparta.mg.springmvcsql.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringMvcsqlApplication {

	private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


	public static void main(String[] args) {
		SpringApplication.run(SpringMvcsqlApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository userRepository) {
		return (args) -> {
			userRepository.save(new UserEntity("Manish", encoder.encode("password"), "ADMIN", 1));
			userRepository.save(new UserEntity("Astha", encoder.encode("password"), "USER", 1));
		};
	}
}
