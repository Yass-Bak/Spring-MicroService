package tn.micro.service.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import tn.micro.service.cloud.entity.Address;

@SpringBootApplication
//@ComponentScan({"tn.micro.service.cloud.controller", "tn.micro.service.cloud.service"})
//@EntityScan("tn.micro.service.cloud.entity")
//@EnableJpaRepositories("tn.micro.service.cloud.repository")
public class UniversityMonolithicApplication {

	//private static AddressRepository addressRepository;

	public static void main(String[] args) {
		System.out.println("---------Démarrage----------");
        ConfigurableApplicationContext contexte = SpringApplication.run(UniversityMonolithicApplication.class, args);
		
      
		
	}

}
