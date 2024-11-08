package mk.ukim.finki.wp.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication//(scanBasePackages = {"mk.ukim.finki.wp.lab", "mk.ukim.finki.wp.lab"} )
@ServletComponentScan(basePackages = "mk.ukim.finki.wp.lab")
public class SpringBootTest3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest3Application.class, args);
    }

    //public SpringBootTest3Application(){}


}
