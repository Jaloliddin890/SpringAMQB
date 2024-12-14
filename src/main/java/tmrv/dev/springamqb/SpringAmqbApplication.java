package tmrv.dev.springamqb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import tmrv.dev.springamqb.task.Sender;


@SpringBootApplication

public class SpringAmqbApplication {

    @Bean
    public CommandLineRunner run(ApplicationContext ctx, Sender messageSender) {
        return args -> {

            messageSender.sendMessage("Assalomu Alaykum");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAmqbApplication.class, args);
    }

}
