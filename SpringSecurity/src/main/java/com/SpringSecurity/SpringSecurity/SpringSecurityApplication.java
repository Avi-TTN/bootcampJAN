package com.SpringSecurity.SpringSecurity;

import com.SpringSecurity.SpringSecurity.entity.User;
import com.SpringSecurity.SpringSecurity.enums.Role;
import com.SpringSecurity.SpringSecurity.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringSecurityApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		PasswordEncoder passwordEncoder = context.getBean(PasswordEncoder.class);
		User admin = new User("admin", passwordEncoder.encode("admin123"), Role.ADMIN);
		User user = new User("user", passwordEncoder.encode("user123"), Role.USER);

		userRepository.save(admin);
		userRepository.save(user);
	}
}
