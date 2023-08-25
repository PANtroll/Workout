package consoleApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages = { "dao", "service", "controller", "to" })
@EntityScan(basePackages = { "model" })
public class WorkoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutApplication.class, args);
//        BasicApplication app = new BasicApplication(3, 3, 2, 3, 5, 3);
//        app.main();
    }
//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            List<String> beanNames = Arrays.stream(ctx.getBeanDefinitionNames()).filter(obj -> !obj.startsWith("org") && !obj.startsWith("spring")).sorted().toList();
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }

    @GetMapping("/")
    public String index() {
        return "Welcome";
    }

}
