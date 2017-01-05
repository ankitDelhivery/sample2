package org.delhivery.Application;

import org.delhivery.Domain.Employee;
import org.delhivery.Domain.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            String url = "http://localhost:8080/greeting?name=Mark";
            Quote quote = restTemplate.getForObject(url, Quote.class);

            String url2 = "http://localhost:8080/getEmployee?id=3&name=Mark&role=CEO";
            Employee employee = restTemplate.getForObject(url2, Employee.class);

            System.out.println(quote.toString()+"\n"+employee.toString());
            log.info(quote.toString()+"\n"+employee.toString());
        };
    }
}
