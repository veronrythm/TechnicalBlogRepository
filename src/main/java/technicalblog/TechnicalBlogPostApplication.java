package technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan
public class TechnicalBlogPostApplication {
    public static void main(String args[]) {
        SpringApplication.run(TechnicalBlogPostApplication.class,args);
    }


}
