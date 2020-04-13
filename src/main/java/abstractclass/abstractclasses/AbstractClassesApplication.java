package abstractclass.abstractclasses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractClassesApplication {

    public static void main(String[] args) {

        SpringApplication.run(AbstractClassesApplication.class, args);

            ExtendsDogClass dog = new ExtendsDogClass();
            dog.bark();
            dog.pop();
        System.out.println("=== Abstract Classes app is running ===");
    }

}
