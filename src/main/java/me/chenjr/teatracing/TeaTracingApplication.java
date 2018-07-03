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
        TeaPkgRepository teaPkgRepository = contex.getBean(TeaPkgRepository.class);
        TeaPkgService teaPkgService = contex.getBean(TeaPkgService.class);


        TeaPkg pkg0=  new TeaPkg("某某知名厂", "SS", "全国最大零售商");

//        teaPkgRepository.save(pkg0);

        teaPkgService.add(pkg0);

    }
}
