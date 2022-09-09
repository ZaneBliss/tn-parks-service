package com.example.tnparksservice;

import com.example.tnparksservice.entities.Park;
import com.example.tnparksservice.repositories.ParkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ParkRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Park("Fall Creek Falls")));
            log.info("Preloading " + repository.save(new Park("South Cumberland State Park")));
        };
    }
}
