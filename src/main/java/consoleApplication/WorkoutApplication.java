package consoleApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutApplication.class, args);
        BasicApplication app = new BasicApplication(1, 1, 1, 1, 1, 1);
        app.main();
    }

}
