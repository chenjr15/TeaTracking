package me.chenjr.teatracing;

import me.chenjr.teatracing.domain.TeaPkg;
import me.chenjr.teatracing.repositories.TeaPkgRepository;
import me.chenjr.teatracing.service.TeaPkgService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TeaTracingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext contex = SpringApplication.run(TeaTracingApplication.class, args);

    }
}
