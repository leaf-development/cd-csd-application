package uk.co.leafdevelopment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CdCsdApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CdCsdApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CdCsdApplication.class);
    }

}
